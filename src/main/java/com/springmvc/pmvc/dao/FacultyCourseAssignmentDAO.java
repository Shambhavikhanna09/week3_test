package com.springmvc.pmvc.dao;
import com.springmvc.pmvc.beans.FacultyCourseAssignment;
import java.util.List;
public interface FacultyCourseAssignmentDAO {
    void assignFacultyToCourse(FacultyCourseAssignment assignment);
    List<FacultyCourseAssignment> getCoursesForFaculty(int facultyId);
}
