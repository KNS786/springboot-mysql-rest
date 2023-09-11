package com.projects.studentsystem.service;

import com.projects.studentsystem.model.Student;
import com.projects.studentsystem.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceActions implements StudentService{

    @Autowired
    private StudentRepo studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
