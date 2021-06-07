package com.example.TEACHER_CORESE.controller;

<<<<<<< Updated upstream
=======
import com.example.TEACHER_CORESE.entity.TeachCourse;
>>>>>>> Stashed changes
import com.example.TEACHER_CORESE.service.TCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< Updated upstream
=======
import java.util.ArrayList;

>>>>>>> Stashed changes
/**
 * @author: LiQingLin
 * @date: 2021/6/4 17:55
 * @description:
 */
@RestController
<<<<<<< Updated upstream
@RequestMapping
=======
@RequestMapping("/tc")
>>>>>>> Stashed changes
public class TCController {

    @Autowired
    private TCService tcService;

    @RequestMapping("/init")
<<<<<<< Updated upstream
    public String init(){
        tcService.init();
        return "success";
    }
=======
    public String init() {
        tcService.init();
        return "success";
    }

    @RequestMapping("/query")
    public ArrayList<TeachCourse> queryCourse() {
        return tcService.findAll();
    }
>>>>>>> Stashed changes
}
