package com.example.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookDAO bookDao;
	
	public List<Book> getAllBooks() {
		return bookDao.findAll();
	}
	
	public void addNewBook(Book book) {
		bookDao.save(book);
	}
	
	public List<Book> findByPartOfSearch(String partOfSearch){
		return bookDao.findByPartOfSearch(partOfSearch);
	}
	
	public void editBook(Long id, Book newBook) {
		Book editedBook = bookDao.findById(id).get();
		editedBook.setTitleOfBook(editedBook.getTitleOfBook());
		editedBook.setDescription(editedBook.getDescription());
		bookDao.save(editedBook);
	}
	
	public void deleteBookById(Long id) {
		bookDao.deleteById(id);
	}

}
