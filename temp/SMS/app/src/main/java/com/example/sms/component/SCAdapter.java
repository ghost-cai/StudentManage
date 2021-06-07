package com.example.sms.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.example.sms.R;
import com.example.sms.entity.TeachCourse;

import java.util.List;

public class SCAdapter extends BaseAdapter {

    private List<TeachCourse> CourseList;
    private LayoutInflater inflater;

    public SCAdapter( Context context,List<TeachCourse> courseList) {
        CourseList = courseList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return CourseList == null ? 0 : CourseList.size();
    }

    @Override
    public Object getItem(int position) {
        return CourseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.sc_item,null);
        TeachCourse course = (TeachCourse) getItem(position);

        TextView courseCode = view.findViewById(R.id.textView4);
        TextView courseName = view.findViewById(R.id.textView5);
        CheckBox isChoose = view.findViewById(R.id.check);
        isChoose.setEnabled(false);

        courseCode.setText(course.getCourseCode());
        courseName.setText(course.getCourseName());

        return view;
    }
}
