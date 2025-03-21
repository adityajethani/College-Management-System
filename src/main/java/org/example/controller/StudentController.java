package org.example.controller;

import org.example.model.Student;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class StudentController {
    @Autowired
    TeacherServiceImpl service;
    @RequestMapping("/update-single-student-himself")
    @ResponseBody
    String updateSingleStudentHimself(@RequestBody Student students){
        return service.updateSingleStudent(students);
    }
    @RequestMapping("/read-single-student-himself")
    @ResponseBody
    Student readSingleStudentHimself(@RequestParam int rollNo){
        return service.readSingleStudent(rollNo);
    }
}
