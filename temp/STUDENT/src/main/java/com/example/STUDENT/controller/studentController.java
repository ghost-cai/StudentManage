package com.example.STUDENT.controller;

import com.example.STUDENT.entity.Student;
import com.example.STUDENT.service.StudentService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 11:49
 * @description:
 */

@RestController
@RequestMapping("/student")
public class studentController {

    @Autowired
    private StudentService studentService;
    Gson gson = new Gson();


    @RequestMapping("/init")
    public String init() {
        studentService.init();
        return "success";
    }

    @RequestMapping("/login")
    public String login(@RequestParam String pam) {
        Student student = gson.fromJson(pam, Student.class);
        String password = studentService.findPasswordBySid(student.getsId());
        if (student.getPassword().equals(password))
            return "success";
        else
            return "failure";
    }

}
