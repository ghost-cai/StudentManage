package com.example.sms.entity;


import android.widget.CheckBox;

/**
 * @author: LiQingLin
 * @date: 2021/6/4 16:18
 * @description:
 */
public class TeachCourse {

    private int tcId;
    private int tId;
    private int courseNo;
    private String courseCode;
    private String courseName;

    public TeachCourse(String name, String code) {
        this.courseName = name;
        this.courseCode = code;
    }


    public int getTcId() {
        return tcId;
    }

    public void setTcId(int tcId) {
        this.tcId = tcId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(int courseNo) {
        this.courseNo = courseNo;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
