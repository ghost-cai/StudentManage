package com.example.GRADE.service;

import com.example.GRADE.dao.GradeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: LiQingLin
 * @date: 2021/6/5 14:19
 * @description:
 */
@Service
public class GradeService {

    @Autowired
    private GradeDao gradeDao;
}
