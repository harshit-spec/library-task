package com.harshit.library.Reposiotory;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.harshit.library.Entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book,String> {

	Book findByGenre(String genre);

	Book findByTitle(String title);

	List<Book> findAllByAuthor(String author);

	List<Book> findAllByGenre(String genre);

}
