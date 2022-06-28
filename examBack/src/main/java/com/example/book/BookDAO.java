package com.example.book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookDAO extends JpaRepository<Book, Long>{
	
	@Query(value = "SELECT * FROM BOOK WHERE LOWER (BOOK_TITLE, BOOK_DESCRIPTION) LIKE LOWER '%' || :partOfSearch || '%'", nativeQuery = true)
	public List<Book> findByPartOfSearch(@Param("partOfSearch") String partOfSearch);

}
