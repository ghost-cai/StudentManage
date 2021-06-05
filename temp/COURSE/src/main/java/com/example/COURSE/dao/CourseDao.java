package com.example.COURSE.dao;

import com.example.COURSE.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 13:52
 * @description:
 */
public interface CourseDao extends JpaRepository<Course,Integer> {
}
