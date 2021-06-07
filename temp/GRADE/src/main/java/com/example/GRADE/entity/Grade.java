package com.example.GRADE.entity;

import javax.persistence.Entity;
<<<<<<< Updated upstream
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
>>>>>>> Stashed changes
import javax.persistence.Id;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 17:23
 * @description:
 */
@Entity
public class Grade {

    @Id
<<<<<<< Updated upstream
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> Stashed changes
    private int gradeId;
    private int sId;
    private String courseName;
    private Double finalGrade;
<<<<<<< Updated upstream
    private int courseCode;

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
=======
    private String courseCode;

    public Grade(int sid, String courseCode, String courseName) {
        this.sId = sid;
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public Grade() {

    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
>>>>>>> Stashed changes
        this.courseCode = courseCode;
    }


    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Double finalGrade) {
        this.finalGrade = finalGrade;
    }
}
