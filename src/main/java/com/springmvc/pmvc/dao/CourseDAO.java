package com.springmvc.pmvc.dao;
import com.springmvc.pmvc.beans.Course;
import java.util.List;
public interface CourseDAO {
    void registerCourse(Course course);
    List<Course> getAllCourses();
}
