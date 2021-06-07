package com.example.sms.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sms.R;
import com.example.sms.component.HttpUtil;
import com.example.sms.component.SCAdapter;
import com.example.sms.entity.Student;
import com.example.sms.entity.TeachCourse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import static com.example.sms.component.CONST.GRADE;
import static com.example.sms.component.CONST.T_C;
import static com.example.sms.component.CONST.userId;

public class StudentSelectCourseActivity extends AppCompatActivity {

    private Intent studentActivity;
    private Intent studentInquireActivity;
    private ImageView imgReturn;
    private Button confirm;
    private Button query;
    private ListView courseView;
    private SCAdapter tcAdapter;
    private ArrayList<TeachCourse> TCList;
    private ArrayList<TeachCourse> ready;
    private TextView alert;

    Gson gson = new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_select_course);

        init();
        setMethod();
    }

    private void setMethod() {

        query.setOnClickListener((View v)->{
            startActivity(studentInquireActivity);
            finish();
        });

        imgReturn.setOnClickListener((View v)->{
            startActivity(studentActivity);
            finish();
        });

        confirm.setOnClickListener((View v)->{
            String courses = gson.toJson(ready);
            new HttpUtil(alert,GRADE+"/grade/select","pam="+courses+"&id="+userId) {
                @Override
                public void handle(String result) {
                    if ("true".equals(result)) {
                        alert.setText("选课成功");
                    }else if ("false".equals(result)){
                        alert.setText("部分课程已经完成选课，请先退课");
                    }
                }
            };
        });

        courseView.setOnItemClickListener((AdapterView<?> parent, View view, int position, long id) -> {
            alert.setText("");
            CheckBox checkBox = view.findViewById(R.id.check);
            TextView nameView = view.findViewById(R.id.textView5);
            TextView codeView = view.findViewById(R.id.textView4);
            String name = (String) nameView.getText();
            String code = (String) codeView.getText();
            TeachCourse teachCourse = new TeachCourse(name, code);
            if (checkBox.isChecked()) {
                removeByCode(code);
                checkBox.setChecked(false);
            } else {
                //检查是否有同名课程被选择
                boolean sameCourse = findSameCourse(name);
                if (sameCourse){
                    //提示已选同名课程
                    alert.setText("已选同名课程");
                }else {
                    ready.add(teachCourse);
                    checkBox.setChecked(true);
                }
            }
        });
    }

    private boolean findSameCourse(String name) {
        for (int i = 0, n = ready.size(); i < n; i++) {
            TeachCourse teachCourse = ready.get(i);
            if (teachCourse.getCourseName().equals(name)){
                return true;
            }
        }
        return false;
    }

    private void removeByCode(String code) {
        for (int i = 0, n = ready.size(); i < n; i++) {
            TeachCourse teachCourse = ready.get(i);
            if (teachCourse.getCourseCode().equals(code)){
                ready.remove(teachCourse);
                break;
            }
        }
    }


    private void init() {
        studentActivity =new Intent(StudentSelectCourseActivity.this,StudentActivity.class);
        studentInquireActivity = new Intent(StudentSelectCourseActivity.this,StudentInquireScoreActivity.class);
        imgReturn = findViewById(R.id.imgv_return);
        confirm = findViewById(R.id.sqlite_btn_insert);
        query = findViewById(R.id.sqlite_btn_query);
        TCList = new ArrayList<>();
        ready = new ArrayList<>();
        tcAdapter = new SCAdapter(this, TCList);
        courseView = findViewById(R.id.courseView);
        alert = findViewById(R.id.textView6);
        initData();
    }

    private void initData() {
        new HttpUtil(alert, T_C + "/tc/query", null) {
            @Override
            public void handle(String result) {
                ArrayList<TeachCourse> tcList =
                        gson.fromJson(result, new TypeToken<ArrayList<TeachCourse>>() {
                        }.getType());
                TCList.addAll(tcList);
                runOnUiThread(() -> {
                    courseView.setAdapter(tcAdapter);
                });
            }
        };
    }
}