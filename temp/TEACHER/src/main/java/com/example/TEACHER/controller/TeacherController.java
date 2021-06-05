package com.example.TEACHER.controller;

import com.example.TEACHER.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 14:36
 * @description:
 */
@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/select")
    public String selectCourse(@RequestParam int tid,@RequestParam int cno){
        teacherService.selectCourse(tid,cno);
        return "success";
    }

    @RequestMapping("/init")
    public void init(){
        teacherService.init();
    }

}
