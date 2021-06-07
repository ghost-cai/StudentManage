package com.example.TEACHER.controller;

<<<<<<< Updated upstream
import com.example.TEACHER.service.TeacherService;
=======
import com.example.TEACHER.entity.Student;
import com.example.TEACHER.entity.Teacher;
import com.example.TEACHER.service.TeacherService;
import com.google.gson.Gson;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
    private Gson gson = new Gson();
>>>>>>> Stashed changes

    @RequestMapping("/select")
    public String selectCourse(@RequestParam int tid,@RequestParam int cno){
        teacherService.selectCourse(tid,cno);
        return "success";
    }

<<<<<<< Updated upstream
=======
    @RequestMapping("/login")
    public String login(@RequestParam String pam) {
        Teacher teacher = gson.fromJson(pam, Teacher.class);
        String password = teacherService.findPasswordBytId(teacher.gettId());
        if (teacher.getPassword().equals(password))
            return "success";
        else
            return "failure";
    }

>>>>>>> Stashed changes
    @RequestMapping("/init")
    public void init(){
        teacherService.init();
    }

}
