package com.example.sms.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sms.R;
import com.example.sms.component.HttpUtil;

import static com.example.sms.component.CONST.GRADE;

public class TeacherRecordActivity extends AppCompatActivity {

    private Button back;
    private Button insert;
    private TextView alert;
    private TextView courseName;
    private TextView stuNo;
    private TextView stuScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_record);

        init();
        setMethod();
    }

    private void init() {
        back = findViewById(R.id.button5);
        insert = findViewById(R.id.sqlite_btn_query);
        courseName = findViewById(R.id.sqlite_et_name);
        stuNo = findViewById(R.id.sqlite_et_number);
        stuScore = findViewById(R.id.stu_score);
        alert = findViewById(R.id.textView10);
    }

    private void setMethod() {
        insert.setOnClickListener((View v)->{
            String name = courseName.getText().toString();
            String sid = stuNo.getText().toString();
            String sScore = stuScore.getText().toString();
            name = "操作系统";
            String pam = "courseName="+name+"&sId="+sid+"&score="+sScore;
            new HttpUtil(null, GRADE+"/grade/update", pam) {
                @Override
                public void handle(String result) {
                    if ("1".equals(result)){
                        alert.setText("更新成功");
                    }else if ("0".equals(result)){
                        alert.setText("更新失败");
                    }else {
                        alert.setText("异常，请稍后重试");
                    }
                }
            };
        });
        back.setOnClickListener((View v)->{
            finish();
        });
    }

}