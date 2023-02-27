package com.springrestapi.springrestapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrestapi.springrestapi.entity.Courses;

public interface CoursesDao extends JpaRepository<Courses, Long> {

}
