package com.qa.rest.POJODeserilzation;

public class MainCourses {
	
	
	private String instructor;
	private String url;
	private String services;
	private String expertise;
	
	private String linkedIn;
	
	private SubCourses courses;
	
	
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	
	public SubCourses getCourses() {
		return courses;
	}
	public void setCourses(SubCourses courses) {
		this.courses = courses;
	}
	public String getLinkedIn() {
		return linkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		this.linkedIn = linkedIn;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	

}
