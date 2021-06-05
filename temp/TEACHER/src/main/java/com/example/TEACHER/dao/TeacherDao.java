package com.example.TEACHER.dao;

import com.example.TEACHER.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 14:29
 * @description:
 */
public interface TeacherDao extends JpaRepository<Teacher,Integer> {
}
