package com.example.STUDENT.dao;

import com.example.STUDENT.entity.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 11:51
 * @description:
 */
public interface StudentDao extends JpaRepository<Student,Integer> {

//    @Transactional
//    @Modifying
//    @Query("update Student b set b.stock = b.stock - ?1 where sId = ?2 and b.stock >= ?1 ")
//    int updateByJPQL(int num, Integer id);

    @Query(value = "SELECT * FROM Goods WHERE category = ?1",
            countQuery = "SELECT count(*) FROM Goods WHERE category = ?1",
            nativeQuery = true)
    Page<Student> findByCategory(String category, Pageable pageable);

    @Query(value = "SELECT password FROM student WHERE s_id = ?1",
            nativeQuery = true)
    String findPwdById(Integer id);
}
