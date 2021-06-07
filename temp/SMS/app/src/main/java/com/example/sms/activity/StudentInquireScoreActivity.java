package com.example.sms.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.sms.R;
import com.example.sms.component.HttpUtil;
import com.example.sms.component.ScoreAdapter;
import com.example.sms.entity.Grade;
import com.example.sms.entity.TeachCourse;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;

import static com.example.sms.component.CONST.GRADE;
import static com.example.sms.component.CONST.userId;

public class StudentInquireScoreActivity extends AppCompatActivity {

    private Intent studentActivity;
    private Button query;
    private Button back;
    private ListView scoreView;
    private ScoreAdapter scoreAdapter;
    private ArrayList<Grade> gradeList;
    private TextView wait;
    Gson gson = new Gson();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_inquire_score);

        init();
        setMethod();

        initData();
    }

    private void initData() {
        new HttpUtil(wait, GRADE+"/grade/queryAll", "id="+userId) {
            @Override
            public void handle(String result) {
                ArrayList<Grade> grades =
                        gson.fromJson(result, new TypeToken<ArrayList<Grade>>() {
                        }.getType());
                gradeList.addAll(grades);
                runOnUiThread(() -> {
                    scoreView.setAdapter(scoreAdapter);
                });
            }
        };
    }

    private void setMethod() {
        back.setOnClickListener((View v)->{
            startActivity(studentActivity);
            finish();
        });
        query.setOnClickListener((View v)->{

        });
    }

    private void init() {
        query = findViewById(R.id.sqlite_btn_query);
        back = findViewById(R.id.sqlite_btn_back);
        scoreView = findViewById(R.id.scoreView);
        gradeList = new ArrayList<>();
        scoreAdapter = new ScoreAdapter(this,gradeList);
        wait = new TextView(this);
        studentActivity = new Intent(StudentInquireScoreActivity.this,StudentActivity.class);

    }
}