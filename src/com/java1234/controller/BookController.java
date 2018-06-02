 package com.java1234.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java1234.entity.Book;

import com.java1234.service.BookService;



@Controller
@RequestMapping( "/book")
public class BookController {
	@Resource
	private BookService bookService;
	
	
	//转去查询页面
	@RequestMapping( "/read")
	public String read()
	{  
		return("list");
		
	}
	
	

 
  //进行查询操作
	@RequestMapping( "/list")
	public String list(Book book ,Model model)
	{    
		System.out.println(book);
		model.addAttribute("book", book);
		List<Book> bookList=bookService.find(book);
		
		 for(Book book1:bookList) {
		
			System.out.println(book1);
		} 
		model.addAttribute("bookList", bookList);
		return("list");
		
	}
	
	//进行更新
	@RequestMapping( "/update.do")
	public String update(@RequestParam(value = "id") int id,HttpServletRequest request)
	{    
		Book book=bookService.getBookById(id);
		HttpSession session=request.getSession();
		session.setAttribute("book", book);
		return("update");
		
	}
	
	//保存修改
		@RequestMapping( "/save")
		public String save(Book book,HttpServletRequest request)
		{   
		   System.out.println(book); 
		  bookService.updateBook(book);
		  HttpSession session=request.getSession();
		  session.setAttribute("book", book);
		  return("list");
			
		}
		
	
	//进行删除
	@RequestMapping( "/delete.do")
	public String delete(@RequestParam(value = "id") int id)
	{
		bookService.delete(id);
		return ("list");    
		
		
	}
	
	
	
	//在页面进行添加
	@RequestMapping( "/add")
	public String add()
	{
		
		return("add");
		
		}

	//在数据库进行添加
		@RequestMapping( "/operater")
		public String tip(Book book)
		{
			bookService.add(book);
			
			return ("tip");
			
			
			}
		
		
		//返回管理界面
		@RequestMapping( "/return")
		public String manager()
		{
			
			
			return ("success");
			
			
			}

	
	
}




