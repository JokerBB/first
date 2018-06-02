package com.java1234.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.java1234.dao.BookDao;
import com.java1234.entity.Book;
import com.java1234.service.BookService;

@Service("bookService")
public class BookServiceImpl implements BookService {
 
	@Resource
	private BookDao bookDao;

	
	public List<Book> find(Book book) {
		
		return bookDao.find(book);
	}


	public Book getBookById(Integer id) {
		
		return bookDao.getBookById(id);
	}


	public void updateBook(Book book) {
		bookDao.updateBook(book);
		
	}



	public int delete(Integer id) {
	
		return bookDao.delete(id);
	}


	
	public int add(Book book) {
		
		return bookDao.add(book);
	}
	

	
	
	

}
