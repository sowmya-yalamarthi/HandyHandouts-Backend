package com.handyhandouts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.handyhandouts.model.Courses;

@Repository
public interface CourseRepository extends JpaRepository<Courses, Long> {

}
