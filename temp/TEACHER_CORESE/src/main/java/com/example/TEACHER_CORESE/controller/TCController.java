package com.example.TEACHER_CORESE.controller;

import com.example.TEACHER_CORESE.service.TCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 17:55
 * @description:
 */
@RestController
@RequestMapping
public class TCController {

    @Autowired
    private TCService tcService;

    @RequestMapping("/init")
    public String init(){
        tcService.init();
        return "success";
    }
}
