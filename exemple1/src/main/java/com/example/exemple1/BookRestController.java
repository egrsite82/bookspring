package com.example.exemple1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webapi")
public class BookRestController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/allbooks")
	public Iterable<Book>  showAllBooks() {
		
		return bookService.queryBooks();
	}
	
	@PostMapping(path="/addBook", consumes="application/json")
	public void insertBook(@RequestBody Book book) {
		
		 bookService.queryAddBook(book);
		 

	}

}
