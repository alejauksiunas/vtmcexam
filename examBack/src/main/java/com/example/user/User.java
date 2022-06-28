package com.example.user;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.example.book.Book;

@Entity
@Table(name = "USER")
public class User {
	
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ_NEXTVAL_ID")
	@SequenceGenerator(name = "USER_SEQ_NEXTVAL_ID", sequenceName = "USER_SEQ_NEXTVAL_ID", allocationSize = 1)
	private Long id;
	
	@Column(name = "USER_NAME")
	private String userName;
	
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user",
            cascade =  CascadeType.ALL)
    private Set<Book> bookList;
	
    @Column(name = "USER_ROLE")
	private Role role;
	
	
	public User() {
		super();
	}

	public User(String userName, Set<Book> bookList, Role role) {
		super();
		this.userName = userName;
		this.bookList = bookList;
		this.role = role;
	}

	public User(Long id, String userName, Set<Book> bookList, Role role) {
		super();
		this.id = id;
		this.userName = userName;
		this.bookList = bookList;
		this.role = role;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
	}

	public Set<Book> getBookList() {
		return bookList;
	}

	public void setBookList(Set<Book> bookList) {
		this.bookList = bookList;
	}
	
}
