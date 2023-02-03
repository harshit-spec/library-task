package com.harshit.library.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.library.Entity.Book;
import com.harshit.library.Service.BookService;



@RestController
public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/add")
	public Book addDetails(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	@GetMapping("/getAllBooks")
	public List<Book> getAllBook() {
		return bookService.getAllBooks();
	}
	@GetMapping("/get/{id}")
	public Book getBook(@PathVariable String id) {
		return bookService.getBook(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.deleteBook(id);
	}
	@PutMapping("/update/{id}")
	public Book updateBook(@RequestBody Book book,@PathVariable String id)  {
		return bookService.updateBook(book, id);
	}
  @GetMapping("/title/{title}")
  public Book getBooksByTitle(@PathVariable("title") String title) {
	  return bookService.getBookByTitle(title);
  }
  
  
  @GetMapping("/genre/{genre}")
  public Book getBookByGenre(@PathVariable("genre") String genre) {
	  return bookService.getBookByGenre(genre);
  }
  
  @GetMapping("/getAllByAuthor/{author}")
  public List<Book> getAllByAuthor(@PathVariable("author") String author){
	  return bookService.getAllBooksByAuthor(author);
  }
  @GetMapping("/getAllByGenre/{genre}")
  public List<Book> getAllByGenre(@PathVariable("genre") String genre){
	  return bookService.getAllBooksByGenre(genre);
  }
}
