package com.java1234.service;

import java.util.List;

import com.java1234.entity.Book;

public interface BookService {
	
	
	public List<Book> find(Book book);
	public Book getBookById(Integer id);
	public void updateBook(Book book);
	public int delete(Integer id);
	public int add(Book book);
	

}
