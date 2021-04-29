package exemple.exemple1client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping("/allBooks")
	public String showAllBooks(Model containerToView) {

		containerToView.addAttribute("booksfromController", bookService.queryBooks());
		// containerToView.addAttribute("fakebooksfromController",
		// bookService.queryFakeBooks());

		return "library";
	}

	@RequestMapping("/deleteBook")
	public String removeBook(@RequestParam("titleFromView") String titleToDelete, Model model) {

		bookService.queryDeleteBook(titleToDelete);
		return "redirect:/books/allBooks";
	}
	
	@RequestMapping("/newBook")
	public String newBook() {

		return "newBook";
	}

	@RequestMapping("/addBook")
	public String insertBook(Book book, Model model) {

		bookService.queryAddBook(book);

		return "redirect:/books/allBooks";
	}

}
