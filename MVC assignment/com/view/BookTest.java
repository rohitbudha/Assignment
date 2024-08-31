package com.view;

import java.util.List;
import java.util.Scanner;

import com.model.Book;
import com.service.BookService;
import com.service.BookServiceImp;

public class BookTest {
	
	public static void main(String[] args) {
		
		addBtn();
		getAll();
		deleteBtn();
	}
	
	
	static void addBtn() {
		
		BookService service = new BookServiceImp();
		char flag = 'y';
		Scanner  sc = new Scanner(System.in);
		
	  do {	
			Book  b = new Book();
			
			System.out.println("Enter Book Name: ");
			b.setName(sc.next());
			
			System.out.println("Enter Book price: ");
			b.setPrice(sc.nextInt());
			
			
			service.addBook(b);
			
			System.out.println("Do you want to add more[y/n]");
			flag = sc.next().charAt(0);
			
	  }while(flag == 'y');
		
	}
	
	static void getAll() {
		
		BookService service = new BookServiceImp();
		List<Book>  blist = service.getAllBooks();
				
		System.out.println(blist);
	}
	
	
	static void deleteBtn() {
		BookService  service = new BookServiceImp();
		 service.deleteBook(0);
		 
		 getAll();
	}

}