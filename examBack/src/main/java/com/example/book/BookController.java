package com.example.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/")
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/books/{partOfSearch}")
	public List<Book> findByPartOfSearch(@PathVariable ("partOfSearch") String partOfSearch){
		return bookService.findByPartOfSearch(partOfSearch);
	}
	
	@PostMapping("/books")
	public void addNewBook(@RequestBody Book book) {
		bookService.addNewBook(book);
	}
	
	@PutMapping("/books/edit/{id}")
	public void editBook(@PathVariable ("id") Long id, @RequestBody Book newBook) {
		bookService.editBook(id, newBook);
	}
	
	@DeleteMapping("/books/delete/{id}")
	public void deleteBook(@PathVariable ("id") Long id) {
		bookService.deleteBookById(id);
	}

}
