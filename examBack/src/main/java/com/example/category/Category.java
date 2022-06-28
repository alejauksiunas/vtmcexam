package com.example.category;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.book.Book;

@Entity
@Table(name = "CATEGORY")
public class Category {
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CATEGORY_SEQ_NEXTVAL_ID")
    @SequenceGenerator(name = "CATEGORY_SEQ_NEXTVAL_ID", sequenceName = "CATEGORY_SEQ_NEXTVAL_ID", allocationSize = 1)
    private Long id;
    
    @Column(name = "CATEGORY_TITLE")
    private String title;

    @ManyToMany(mappedBy = "categoryList", fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH})
    private List<Book> bookList;
    

	public Category() {
		super();
	}

	public Category(String title, List<Book> bookList) {
		super();
		this.title = title;
		this.bookList = bookList;
	}

	public Category(Long id, String title, List<Book> bookList) {
		super();
		this.id = id;
		this.title = title;
		this.bookList = bookList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
}
