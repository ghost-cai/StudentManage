package com.example.TEACHER_CORESE.service;

import com.example.TEACHER_CORESE.dao.TCDao;
<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
import com.example.TEACHER_CORESE.entity.TeachCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

>>>>>>> Stashed changes
/**
 * @author: LiQingLin
 * @date: 2021/6/4 17:54
 * @description:
 */

@Service
public class TCService {
    @Autowired
    private TCDao tcDao;

    public void init() {

    }
<<<<<<< Updated upstream
=======

    public ArrayList<TeachCourse> findAll() {
        return (ArrayList<TeachCourse>) tcDao.findAll();
    }
>>>>>>> Stashed changes
}
