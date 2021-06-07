package com.example.GRADE.dao;

import com.example.GRADE.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< Updated upstream
=======
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
>>>>>>> Stashed changes

/**
 * @author: LiQingLin
 * @date: 2021/6/5 14:20
 * @description:
 */
public interface GradeDao extends JpaRepository<Grade,Integer> {
<<<<<<< Updated upstream
=======

    @Query(value = "SELECT password FROM student WHERE s_id = ?1",
            nativeQuery = true)
    String findPwdById(Integer id);

    @Query(value = "SELECT COUNT(*) FROM grade WHERE s_id = ?1 and course_name = ?2",
            nativeQuery = true)
    int findBySIdAndCName(int sid, String courseName);

    @Query(value = "SELECT * FROM grade WHERE s_id = ?1",
            nativeQuery = true)
    ArrayList<Grade> findAllBysId(int id);

    @Transactional
    @Modifying
    @Query(value = "update grade set final_grade = ?3 WHERE s_id = ?2 and course_name = ?1",
            nativeQuery = true)
    int update(String courseName, int sid, Double score);
>>>>>>> Stashed changes
}
