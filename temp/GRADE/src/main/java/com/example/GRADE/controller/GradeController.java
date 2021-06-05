package com.example.GRADE.controller;

import com.example.GRADE.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiQingLin
 * @date: 2021/6/5 14:21
 * @description:
 */
@RestController
@RequestMapping("/grade")
public class GradeController {

    @Autowired
    private GradeService gradeService;
}
