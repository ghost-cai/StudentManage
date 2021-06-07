package com.example.TEACHER.dao;

import com.example.TEACHER.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< Updated upstream
=======
import org.springframework.data.jpa.repository.Query;
>>>>>>> Stashed changes

/**
 * @author: LiQingLin
 * @date: 2021/6/4 14:29
 * @description:
 */
public interface TeacherDao extends JpaRepository<Teacher,Integer> {
<<<<<<< Updated upstream
=======

    @Query(value = "SELECT password FROM teacher WHERE t_id = ?1",
            nativeQuery = true)
    String findPwdById(int id);

//    void findByTidAndCno(int tid, int cno);
>>>>>>> Stashed changes
}
