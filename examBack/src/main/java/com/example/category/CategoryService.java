package com.example.category;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

	@Autowired
	CategoryDAO categoryDao;
	
	public List<Category> getAllCategories() {
		return categoryDao.findAll();
	}
	
	public void addNewCategory(Category category) {
		categoryDao.save(category);
	}
	
	public List<Category> findByPartOfTitle(String partOfTitle) {
		return categoryDao.findByPartOfTitle(partOfTitle);
	}
	
	public void deleteCategory(Long id) {
		categoryDao.deleteById(id);
	}
}
