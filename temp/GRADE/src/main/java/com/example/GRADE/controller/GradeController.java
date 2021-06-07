package com.example.GRADE.controller;

<<<<<<< Updated upstream
import com.example.GRADE.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

=======
import com.example.GRADE.entity.Grade;
import com.example.GRADE.entity.TeachCourse;
import com.example.GRADE.service.GradeService;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
    Gson gson = new Gson();

    @RequestMapping("/select")
    public String selectCourse(@RequestParam String pam,@RequestParam int id){
        ArrayList<TeachCourse> tcList =
                gson.fromJson(pam, new TypeToken<ArrayList<TeachCourse>>() {}.getType());
        int size = tcList.size();
        ArrayList<Grade> gradeList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TeachCourse teachCourse = tcList.get(i);
            gradeList.add(new Grade(id,teachCourse.getCourseCode(),teachCourse.getCourseName()));
        }
        boolean isAllUnique = gradeService.saveListUnique(gradeList);
        return String.valueOf(isAllUnique);
    }

    @RequestMapping("/update")
    public int update(@RequestParam String courseName,@RequestParam int sId,@RequestParam Double score){
        return gradeService.updateRecord(courseName,sId,score);
    }

    @RequestMapping("/queryAll")
    public ArrayList<Grade> findAll(@RequestParam int id){
        return gradeService.findAllById(id);
    }

    @RequestMapping("/removeAll")
    public void removeAll(){
        gradeService.removeAll();
    }
>>>>>>> Stashed changes
}
