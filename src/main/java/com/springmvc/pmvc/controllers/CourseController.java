package com.springmvc.pmvc.controllers;

import com.springmvc.pmvc.beans.Course;
import com.springmvc.pmvc.dao.CourseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    
    private final CourseDAO courseDAO;

    @Autowired
    public CourseController(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @GetMapping("")
    public String showCourses(Model model) {
        List<Course> courses = courseDAO.getAllCourses();
        model.addAttribute("courses", courses);
        return "course-list";  // Must match a JSP file in WEB-INF/views
    }

    @PostMapping("/register")
    public String registerCourse(@ModelAttribute("course") Course course) {
        courseDAO.registerCourse(course);
        return "redirect:/course";
    }
}
