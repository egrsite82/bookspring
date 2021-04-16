package com.example.exemple1;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

@Service
public class BookService {

	static List<Book> books = new ArrayList<Book>();
	static List<Book> fakebooks = new ArrayList<Book>();
	
	static {
		Book book1 = new Book("Anna Karenina", "BASGA15-252S38", 568, 1872, "Leon Tolstoi");
		Book book2 = new Book("To The LightHouse", "BSDGA15-278912", 356, 1926, "Virginia Wolf");
		Book book3 = new Book("War and Peace", "BAgyg15-250092", 528, 1872, "Leon Tolstoi");
		Book book4 = new Book("Orlando", "yuplA15-340112", 356, 1926, "Virginia Wolf");
		Book book5 = new Book("Programming", "RETEWRT-340112", 356, 1926, "Engelbert");
		Book book6 = new Book("Programming api rest", "4564564564646", 356, 1926, "Boris Omar");
		books.add(book1);
		books.add(book2);
		books.add(book3);
		books.add(book4);
		books.add(book5);
		books.add(book6);
	}

	public List<Book> queryBooks() {

		// there will be a REAL query
		return books;
	}

	public List<Book> queryFakeBooks() {
		
		int i = 0;
		Faker newfakebook = new Faker();
		
		while (i < 10000) {

			String author = newfakebook.book().author();
			String genre = newfakebook.book().genre();
			String title = newfakebook.book().title();

			fakebooks.add(new Book(title, genre, getRandomNumber(100, 1250), getRandomNumber(1800, 2021), author));
			i++;
		}

		return fakebooks;
	}

	public boolean queryAddBook (Book newbooktoadd) {
		
		this.books.add(newbooktoadd);
		
		
		return true;
		
	}
	
	public int getRandomNumber(int min, int max) {
		return (int) ((Math.random() * (max - min)) + min);
	}

}
