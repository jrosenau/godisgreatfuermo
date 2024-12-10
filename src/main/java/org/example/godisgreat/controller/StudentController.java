package org.example.godisgreat.controller;

import org.example.godisgreat.entity.Student;
import org.example.godisgreat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/new")
    Student addStudnet(@RequestBody Student student){
       return studentService.create(student);
    }
}
