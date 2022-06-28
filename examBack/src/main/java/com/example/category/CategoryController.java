package com.example.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;

	@GetMapping("/list")
	public List<Category> getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@PostMapping("/list")
	public void addNewCategory(@RequestBody Category category) {
		categoryService.addNewCategory(category);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCategory(@PathVariable ("id") Long id) {
		categoryService.deleteCategory(id);
	}
	
	@GetMapping("/list/{partOfSearch}")
	public List<Category> findByPartOfSearch(@PathVariable("partOfSearch") String partOfSearch) {
		return categoryService.findByPartOfTitle(partOfSearch);
	}
}
