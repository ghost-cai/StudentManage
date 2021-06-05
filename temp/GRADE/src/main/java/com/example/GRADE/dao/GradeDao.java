package com.example.GRADE.dao;

import com.example.GRADE.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: LiQingLin
 * @date: 2021/6/5 14:20
 * @description:
 */
public interface GradeDao extends JpaRepository<Grade,Integer> {
}
