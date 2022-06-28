package com.example.book;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.category.Category;
import com.example.user.User;

//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
@Entity
@Table(name = "BOOK")
public class Book {
	
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOK_SEQ_NEXTVAL_ID")
    @SequenceGenerator(name = "BOOK_SEQ_NEXTVAL_ID", sequenceName = "BOOK_SEQ_NEXTVAL_ID", allocationSize = 1)
	private Long id;
    
	@Column(name="BOOK_TITLE")
	private String titleOfBook;
	
	@Column(name="BOOK_DESCRIPTION")
	private String description;
	
	@Column(name="BOOK_PAGES")
	private Long pages;
	
	
	@Column(name="BOOK_DATEADD")
	private LocalDate dateAdded;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EDIT_USER_ID")
    private User bookUser;
	
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.REFRESH})
    @JoinTable(name = "BOOK_CATEGORY", joinColumns = @JoinColumn(name = "BOOK_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID"))
    private Set<Category> categories;
	
	public Book() {
		super();
	}
	
	public Book(Long id, String titleOfBook, String description, Long pages, LocalDate dateAdded, User bookUser,
			Set<Category> categories) {
		super();
		this.id = id;
		this.titleOfBook = titleOfBook;
		this.description = description;
		this.pages = pages;
		this.dateAdded = dateAdded;
		this.bookUser = bookUser;
		this.categories = categories;
	}

	public Book(String titleOfBook, String description, Long pages, LocalDate dateAdded, User bookUser,
			Set<Category> categories) {
		super();
		this.titleOfBook = titleOfBook;
		this.description = description;
		this.pages = pages;
		this.dateAdded = dateAdded;
		this.bookUser = bookUser;
		this.categories = categories;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitleOfBook() {
		return titleOfBook;
	}

	public void setTitleOfBook(String titleOfBook) {
		this.titleOfBook = titleOfBook;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPages() {
		return pages;
	}

	public void setPages(Long pages) {
		this.pages = pages;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	public User getBookUser() {
		return bookUser;
	}

	public void setBookUser(User bookUser) {
		this.bookUser = bookUser;
	}

	public Set<Category> getCategories() {
		return categories;
	}

	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
	
	
}
