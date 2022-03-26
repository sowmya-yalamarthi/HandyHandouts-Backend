package com.handyhandouts.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.handyhandouts.dto.BookDto;
import com.handyhandouts.model.Book;
import com.handyhandouts.model.Courses;
import com.handyhandouts.repository.BookRepositoary;
import com.handyhandouts.repository.CourseRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepositoary bookRepo;
	
	@Autowired
	private CourseRepository courseRepo;
	
	public Book createBook(BookDto book) {
	  Book newBook = new Book();
	  newBook.setBook_id(book.getBook_id());
	  newBook.setTitle(book.getTitle());
	  newBook.setBook_author(book.getBook_author());
	  newBook.setRating(book.getRating());
	  newBook.setCreated_by(book.getCreated_by());
	  newBook.setCreated_date(LocalDate.now());
	  if(book.getCourse_id() !=null) {
	  newBook.setCourse_id(book.getCourse_id());
	  }else {
		  Courses course = new Courses();
		  course.setCourse_id(book.getCourse().getCourse_id());
		  course.setTitle(book.getCourse().getTitle());
		  course.setCreated_by(book.getCreated_by());
		  course.setCreated_date(LocalDate.now());
		  course = courseRepo.save(course);
		  newBook.setCourse_id(course.getCourse_id());
	  }
	  
	  return bookRepo.save(newBook);
	}
	
	public List<Book> getAllBooks(){
		return bookRepo.findAll();
	}
	
	public Optional<Book> getById(Long id) {
		return bookRepo.findById(id);
	}
	
	public String deleteBook(Long id) {
		bookRepo.deleteById(id);
		return "Successfully Deleted the Record";
	}
	
	public Book updateBook(Book book) {
		 Book updatebook = bookRepo.findById(book.getId()).get();
		 updatebook.setBook_author(book.getBook_author());
		 updatebook.setCreated_by(updatebook.getCreated_by());
		 updatebook.setCreated_date(updatebook.getCreated_date());
		 updatebook.setBook_id(book.getBook_id());
		 updatebook.setModified_date(LocalDate.now());
		 updatebook.setRating(book.getRating());
		 updatebook.setTitle(book.getTitle());
		 return bookRepo.save(updatebook);
	}
     
	public String saveALLBooks(List<BookDto> books) {
		for(BookDto book:books) {
			Book newBook = new Book();
			  newBook.setBook_id(book.getBook_id());
			  newBook.setTitle(book.getTitle());
			  newBook.setBook_author(book.getBook_author());
			  newBook.setRating(book.getRating());
			  newBook.setCreated_by(book.getCreated_by());
			  newBook.setCreated_date(LocalDate.now());
			  if(book.getCourse_id() !=null) {
			  newBook.setCourse_id(book.getCourse_id());
			  }else {
				  Courses course = new Courses();
				  course.setCourse_id(book.getCourse().getCourse_id());
				  course.setTitle(book.getCourse().getTitle());
				  course.setCreated_by(book.getCreated_by());
				  course.setCreated_date(LocalDate.now());
				  course = courseRepo.save(course);
				  newBook.setCourse_id(course.getCourse_id());
			  }
			  
			  bookRepo.save(newBook);
		}
		
		return "Successfully Inserted";
		
	}
}
