package com.example.exemple1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	static List<Book> books = new ArrayList<Book>();
	
	
	static {
		
		Book book1= new Book("Anna Karenina","BASGA15-252S38",568, 1872, "Leon Tolstoi");
		Book book2= new Book("To The LightHouse","BSDGA15-278912",356, 1926, "Virginia Wolf");
		Book book3= new Book("War and Peace","BAgyg15-250092",528, 1872, "Leon Tolstoi");
		Book book4= new Book("Orlando","yuplA15-340112",356, 1926, "Virginia Wolf");
		Book book5= new Book("Programming","RETEWRT-340112",356, 1926, "Engelbert");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
	}
	
	
	public List<Book> queryBooks(){
		
		return books;
	}
	
	
}
