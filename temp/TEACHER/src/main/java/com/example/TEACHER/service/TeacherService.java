package com.example.TEACHER.service;

import com.example.TEACHER.dao.TeacherDao;
import com.example.TEACHER.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 14:30
 * @description:
 */
@Service
public class TeacherService {

    @Autowired
    private TeacherDao teacherDao;

    public void init() {
        ArrayList<Teacher> teachers = createData();
        teacherDao.saveAll(teachers);
    }

    private ArrayList<Teacher> createData() {
        ArrayList<Teacher> teachers = new ArrayList<>();
        String[] names = {"昭仪","赵二","赵珊","赵四","赵武","赵六"};
        for (int i = 0; i < 6; i++) {
            teachers.add(new Teacher(names[i],"女","教授","pwd"+i));
        }
        return teachers;
    }

    public void selectCourse(int tid, int cno) {
<<<<<<< Updated upstream
        teacherDao.findByTidAndCno(tid,cno);
=======
//        teacherDao.findByTidAndCno(tid,cno);
    }

    public String findPasswordBytId(int id) {
        return teacherDao.findPwdById(id);
>>>>>>> Stashed changes
    }
}
