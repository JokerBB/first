package com.java1234.dao;

import java.util.List;

import com.java1234.entity.Book;






public interface BookDao {
	//查找书籍
	public List<Book> find(Book book);
	
	//通过id查找书本
	public Book getBookById(Integer id);

	//更新数据库里面这个书的信息并返回更新信息
	public void updateBook(Book book);
    
	//根据ID在数据库删除这本书的信息
	public int delete(Integer id);
	
	
	//往数据库里添加数据
	public int add(Book book);



	
}
