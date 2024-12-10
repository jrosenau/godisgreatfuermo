package org.example.godisgreat.service;

import org.example.godisgreat.entity.Class;
import org.example.godisgreat.entity.Student;
import org.example.godisgreat.repository.ClassRepository;
import org.example.godisgreat.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;

    public Class create(Class class1){
        return classRepository.save(class1);
    }
}
