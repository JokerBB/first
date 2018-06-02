package com.java1234.dao;

import java.util.List;

import com.java1234.entity.Book;






public interface BookDao {
	//�����鼮
	public List<Book> find(Book book);
	
	//ͨ��id�����鱾
	public Book getBookById(Integer id);

	//�������ݿ�������������Ϣ�����ظ�����Ϣ
	public void updateBook(Book book);
    
	//����ID�����ݿ�ɾ���Ȿ�����Ϣ
	public int delete(Integer id);
	
	
	//�����ݿ����������
	public int add(Book book);



	
}
