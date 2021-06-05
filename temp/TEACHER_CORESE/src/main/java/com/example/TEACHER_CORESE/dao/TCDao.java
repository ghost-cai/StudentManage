package com.example.TEACHER_CORESE.dao;

import com.example.TEACHER_CORESE.entity.Teacher_Course;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 17:50
 * @description:
 */
public interface TCDao extends JpaRepository<Teacher_Course,Integer> {
}
