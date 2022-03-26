package com.handyhandouts.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handyhandouts.dto.BookDto;
import com.handyhandouts.model.Book;
import com.handyhandouts.service.BookService;

@RestController
@RequestMapping("/book")
@CrossOrigin("*")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("/create")
	public Book saveBook(@RequestBody BookDto book) {
		return bookService.createBook(book);
	}
	
	@PostMapping("/getById")
	public Optional<Book> findById(@RequestBody Book book) {
		return bookService.getById(book.getId());
	}
	
	@GetMapping("/all")
	public List<Book> findAll(){
		return bookService.getAllBooks();
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}
	
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
    	return bookService.deleteBook(id);
    }
    
    @PostMapping("/saveAll")
    public String createAll(@RequestBody List<BookDto> books) {
    	return bookService.saveALLBooks(books);
    }
}
