package com.springrestapi.springrestapi.services;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.springrestapi.springrestapi.entity.Courses;

public interface CourseService {
	public List <Courses> getCourses();
	public Courses getCourses(long courseId);
	public Courses addCourse(Courses courses);
	public Courses updateCourse(Courses courses);
	public void deleteCourse(long parseLong);

}
