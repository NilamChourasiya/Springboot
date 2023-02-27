package com.springrestapi.springrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.springrestapi.springrestapi.entity.Courses;
import com.springrestapi.springrestapi.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to home page";
	}

	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return this.courseService.getCourses();
	}

	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable long courseId) {
		return this.courseService.getCourses(courseId);

	}

	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		return this.courseService.addCourse(courses);
	}
    @PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses courses) {
		return this.courseService.updateCourse(courses);
	}
}