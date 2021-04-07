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
	
 
	@RequestMapping("/newBook")
	public String createBook() {
		
		Book newbookAux = new Book();
		
		//call to service!!! >> newBookAux
		return "newBookCreated";
	}
	
	
	@RequestMapping("/allbooks")
	public String showAllBooks(Model model) {
		
		model.addAttribute("booksfromController", bookService.queryBooks() );
		
		return "library";
	}

}
