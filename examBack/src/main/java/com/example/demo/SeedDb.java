//package com.example.demo;
//
//import java.time.LocalDate;
//import java.time.Month;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//
//import com.example.book.Book;
//import com.example.book.BookDAO;
//import com.example.category.CategoryDAO;
//import com.example.user.User;
//import com.example.user.UserDAO;
//
//public class SeedDb {
//
//  @Autowired
//  BookDAO bookDao;
//
//  @Autowired
//  UserDAO userDao;
//
//  @Autowired
//  CategoryDAO categoryDao;
//
//  @Bean
//  CommandLineRunner cmdRunner(BookDAO bookDao) {
//      return args -> {
//          Book testBook1 = new Book(
//        		  "Pavadinimas1",
//        		  "Description1",
//        		  111L,
//        		  LocalDate.of(2022, Month.APRIL, 24), null, null        		
//        		  );
//          Book testBook2 = new Book(
//        		  "Pavadinimas2",
//        		  "Description2",
//        		  222L,
//        		  LocalDate.of(2022, Month.MAY, 24), null, null  
//        		  );
//          bookDao.saveAll(List.of(testBook1, testBook2));
////          userDao.deleteAll();
////          categoryDao.deleteAll();
////          bookDao.deleteAll();
//      };
//  }
//}
