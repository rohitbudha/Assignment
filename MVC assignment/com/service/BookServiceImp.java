package com.service;

import java.util.ArrayList;
import java.util.List;

import com.model.Book;

public class BookServiceImp implements BookService {
	
	  static List<Book>  blist = new ArrayList<>();

	@Override
	public void addBook(Book bk) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");	
			
			
			String sql = "insert into book(name,price)values('"+bk.getName()+"','"+bk.getPrice()+"')";
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

	@Override
	public void deleteBook(int index) {
		
		blist.remove(index);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return blist; 
	}

}