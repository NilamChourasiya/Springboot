package com.springrestapi.springrestapi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestapi.springrestapi.dao.CoursesDao;
import com.springrestapi.springrestapi.entity.Courses;

@Service
public class CourseServiceImpl implements CourseService {
	//List<Courses> list;
	@Autowired
	private CoursesDao coursesDao;
	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Courses(145, "Core Java Course", "course contains basics of  Core Java "));
//		list.add(new Courses(14465, "Springboot Course", "Creating  RESTAPI using springboot "));
//		
	}

	@Override
	public List<Courses> getCourses() {
		return coursesDao.findAll();
	}

	@Override
	public Courses getCourses(long courseId) {
//		Courses c = null;
//		for (Courses a : list) {
//			if (a.getId() == courseId) {
//				c = a;
//			}
//		}
		return coursesDao.getOne(courseId);
	}

	@Override
	public Courses addCourse(Courses courses) {
    // list.add(courses);
		return coursesDao.save(courses);
	}

	@Override
	public Courses updateCourse(Courses courses) {
		// TODO Auto-generated method stub
		coursesDao.save(courses);
		return courses;
	}
	@Override
	public void deleteCourse(long parseLong) {
		//Courses entity= coursesDao.getOne(parseLong);
		//coursesDao.delete(entity);
		
	}

}
