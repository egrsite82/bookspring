package com.example.exemple1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/books")
public class BookController {
	
	
@Autowired
BookService	bookService;
	
 	
	
	@RequestMapping("/allbooks")
	public String showAllBooks(Model containerToView) {
		
		containerToView.addAttribute("booksfromController", bookService.queryBooks() );
		containerToView.addAttribute("fakebooksfromController",  bookService.queryFakeBooks());
		
		return "library";
	}
	
	
	

}