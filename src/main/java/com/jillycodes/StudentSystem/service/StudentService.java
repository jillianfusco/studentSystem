package com.jillycodes.StudentSystem.service;

import com.jillycodes.StudentSystem.model.Student;

import java.util.List;

public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
