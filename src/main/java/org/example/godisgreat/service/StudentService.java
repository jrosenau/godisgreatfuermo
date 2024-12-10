package org.example.godisgreat.service;

import org.example.godisgreat.entity.Student;
import org.example.godisgreat.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student create(Student student){
        return studentRepository.save(student);
    }
}
