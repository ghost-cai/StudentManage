package com.example.TEACHER_CORESE.service;

import com.example.TEACHER_CORESE.dao.TCDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 17:54
 * @description:
 */

@Service
public class TCService {
    @Autowired
    private TCDao tcDao;

    public void init() {

    }
}
