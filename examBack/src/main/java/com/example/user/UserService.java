package com.example.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserDAO userDao;
	
	public List<User> getAll() {
		return userDao.findAll();
	}
	
	public void addNewUser(User user) {
		userDao.save(user);
	}
	
	public void deleteUser(Long id) {
		userDao.deleteById(id);
	}
}
