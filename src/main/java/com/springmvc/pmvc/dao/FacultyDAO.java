package com.springmvc.pmvc.dao;
import com.springmvc.pmvc.beans.Faculty;
import java.util.List;
public interface FacultyDAO {
    void registerFaculty(Faculty faculty);
    Faculty getFacultyByEmail(String email);
    List<Faculty> getAllFaculties();
}
