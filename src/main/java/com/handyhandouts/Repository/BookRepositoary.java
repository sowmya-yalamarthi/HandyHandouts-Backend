package com.handyhandouts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.handyhandouts.model.Book;

@Repository
public interface BookRepositoary extends JpaRepository<Book, Long> {

}
