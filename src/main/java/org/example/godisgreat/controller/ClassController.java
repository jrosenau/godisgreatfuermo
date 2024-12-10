package org.example.godisgreat.controller;

import org.example.godisgreat.entity.Class;
import org.example.godisgreat.service.ClassService;
import org.example.godisgreat.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassController {

    @Autowired
    ClassService classService;

    @PostMapping("/addclass")
    Class newClass(@RequestBody Class class1){
        return classService.create(class1);
    }

}
