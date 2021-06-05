package com.example.COURSE.controller;

import com.example.COURSE.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 14:05
 * @description:
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/init")
    public String init(){
        courseService.init();
        return "success";
    }
}
