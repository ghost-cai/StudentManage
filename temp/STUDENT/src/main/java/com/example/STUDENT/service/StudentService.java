package com.example.STUDENT.service;

import com.example.STUDENT.dao.StudentDao;
import com.example.STUDENT.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 12:14
 * @description:
 */
@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    //对学生，信息初始化
    public void init() {
        ArrayList<Student> students = initStudents();
        studentDao.saveAll(students);
    }

    private ArrayList<Student> initStudents() {
        String[] names = {"仗义","张二","张三","张四","张武","张柳","账期","丈八","张久","张氏"};
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student(names[i],"男",18,"password"+i));
        }
        return students;
    }

    public String findPasswordBySid(int id) {
        return studentDao.findPwdById(id);
    }
}

