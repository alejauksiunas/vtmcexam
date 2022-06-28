package com.example.category;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryDAO extends JpaRepository<Category, Long>{
	
	@Query(value = "SELECT * FROM CATEGORY WHERE LOWER (CATEGORY_TITLE) LIKE LOWER '%' || :partOfTitle || '%'", nativeQuery = true)
	public List<Category> findByPartOfTitle(@Param("partOfTitle") String partOfTitle);

}
