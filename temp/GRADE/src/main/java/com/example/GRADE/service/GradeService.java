package com.example.GRADE.service;

import com.example.GRADE.dao.GradeDao;
<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

=======
import com.example.GRADE.entity.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

>>>>>>> Stashed changes
/**
 * @author: LiQingLin
 * @date: 2021/6/5 14:19
 * @description:
 */
@Service
public class GradeService {

    @Autowired
    private GradeDao gradeDao;
<<<<<<< Updated upstream
=======

    public boolean saveListUnique(ArrayList<Grade> gradeList) {
        boolean f = true;
        Iterator<Grade> iterator = gradeList.iterator();
        while (iterator.hasNext()){
            Grade grade = iterator.next();
            int result = gradeDao.findBySIdAndCName(grade.getsId(), grade.getCourseName());
            if (result>0){
                gradeList.remove(grade);
                f = false;
            }
        }
        gradeDao.saveAll(gradeList);
        return f;
    }


    public void removeAll() {
        gradeDao.deleteAll();
    }

    public ArrayList<Grade> findAllById(int id) {
        return gradeDao.findAllBysId(id);
    }

    public int updateRecord(String courseName, int sid, Double score) {
        return gradeDao.update(courseName,sid,score);
    }
>>>>>>> Stashed changes
}
