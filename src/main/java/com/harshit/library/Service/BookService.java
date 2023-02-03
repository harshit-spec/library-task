package com.harshit.library.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harshit.library.Entity.Book;
import com.harshit.library.Reposiotory.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book) ;
	}

	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public Book getBook(String id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	public void deleteBook(String id) {
		// TODO Auto-generated method stub
		 bookRepository.deleteById(id);
	}

	public Book updateBook(Book book, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Book getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitle(title);
	}

	public Book getBookByGenre(String genre) {
		// TODO Auto-generated method stub
		return bookRepository.findByGenre(genre);
	}

	

	public List<Book> getAllBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepository.findAllByAuthor(author);
	}

	public List<Book> getAllBooksByGenre(String genre) {
		// TODO Auto-generated method stub
		return bookRepository.findAllByGenre(genre);
	}

}
