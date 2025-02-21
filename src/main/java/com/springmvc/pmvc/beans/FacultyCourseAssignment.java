package com.springmvc.pmvc.beans;

public class FacultyCourseAssignment {
	public FacultyCourseAssignment(int id, int facultyId, int courseId) {
        this.id = id;
        this.facultyId = facultyId;
        this.courseId = courseId;
    }
	
	 private int id;
	 private int facultyId;
	 private int courseId;
	    
	 public FacultyCourseAssignment() {}
	    
	 public int getId() { 
		 return id; 
		 }
	 public void setId(int id) {
		 this.id = id; 
		 }
	 public int getFacultyId() {
		 return facultyId; 
		 }
	 public void setFacultyId(int facultyId) {
		 this.facultyId = facultyId; 
		 }
	 public int getCourseId() {
		 return courseId; 
		 }
	 public void setCourseId(int courseId) {
		 this.courseId = courseId; 
		 }

}
