package com.service;

import java.util.List;

import com.model.Book;

public interface BookService{
	void addBook(Book bk);
	void deleteBook(int index);
	
	List<Book> getAllBooks();


}
