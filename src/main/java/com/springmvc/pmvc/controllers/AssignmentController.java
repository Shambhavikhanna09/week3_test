package com.springmvc.pmvc.controllers;

import com.springmvc.pmvc.beans.FacultyCourseAssignment;
import com.springmvc.pmvc.dao.FacultyCourseAssignmentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/assignment")
public class AssignmentController {
    
    private final FacultyCourseAssignmentDAO assignmentDAO;

    @Autowired
    public AssignmentController(FacultyCourseAssignmentDAO assignmentDAO) {
        this.assignmentDAO = assignmentDAO;
    }

    @PostMapping("/assign")
    public String assignFacultyToCourse(@ModelAttribute("assignment") FacultyCourseAssignment assignment) {
        assignmentDAO.assignFacultyToCourse(assignment);
        return "redirect:/";
    }
}
