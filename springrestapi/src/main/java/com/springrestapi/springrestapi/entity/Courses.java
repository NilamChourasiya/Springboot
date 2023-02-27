package com.springrestapi.springrestapi.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	//IDENTITY likhne se automatic id ki value dega like 1,,2,3.....
	private long id;
	@Column(name="Course_Title")
	private String coursetitle;
	@Column(name="Description")
	private String description;
	
	public Courses() {
		super();
	}

	public Courses(long id, String coursetital, String description) {
		super();
		this.id = id;
		this.coursetitle = coursetitle;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", coursetital=" + coursetitle + ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCoursetital() {
		return coursetitle;
	}

	public void setCoursetital(String coursetital) {
		this.coursetitle = coursetital;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
