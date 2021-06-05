package com.example.COURSE.service;

import com.example.COURSE.dao.CourseDao;
import com.example.COURSE.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 14:04
 * @description:
 */
@Service
public class CourseService {

    @Autowired
    private CourseDao courseDao;

    public void init() {
        ArrayList<Course> courses = createDate();
        courseDao.saveAll(courses);
    }

    private ArrayList<Course> createDate() {
        ArrayList<Course> courses = new ArrayList<>();
        String[] names = {"软件工程导论","操作系统","计算机组成原理","编译原理","数据结构","计算机网络"};
        for (int i = 0; i < 6; i++) {
            courses.add(new Course(names[i],2));
        }
        return courses;
    }
}
