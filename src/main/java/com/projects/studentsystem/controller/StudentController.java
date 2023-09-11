package com.projects.studentsystem.controller;

import com.projects.studentsystem.model.Student;
import com.projects.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student/add")
    public String add(@RequestBody Student student){

        studentService.saveStudent(student);
        return "New Students is Added";
    }

    @GetMapping("/student/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
