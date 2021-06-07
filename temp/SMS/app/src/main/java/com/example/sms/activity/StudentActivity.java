package com.example.sms.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
<<<<<<< Updated upstream
=======
import android.view.View;
import android.widget.Button;
>>>>>>> Stashed changes
import android.widget.TextView;

import com.example.sms.R;
import com.google.gson.Gson;

<<<<<<< Updated upstream
=======
import static com.example.sms.component.CONST.userId;

>>>>>>> Stashed changes

/**
 * 学生：
 *      选课
 *      查成绩
 */
public class StudentActivity extends AppCompatActivity {

<<<<<<< Updated upstream
    private int userId;
    private TextView wait;
    private Intent intent ;
=======
    private Intent intent ;
    private Intent SSCA;
    private Intent SIS;
    private Intent login;

    private Button selectCourse;
    private Button inquireScore;
    private Button logout;
    private TextView wait;
>>>>>>> Stashed changes
    Gson gson =new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        init();
        setMethod();

    }

    private void setMethod() {
<<<<<<< Updated upstream

=======
        selectCourse.setOnClickListener((View v)->{
            startActivity(SSCA);
            finish();
        });
        inquireScore.setOnClickListener((View v)->{
            startActivity(SIS);
            finish();
        });
        logout.setOnClickListener((View v)->{
            userId = -1;
            startActivity(login);
            finish();
        });
>>>>>>> Stashed changes
    }

    private void init() {
        intent = getIntent();
<<<<<<< Updated upstream
        userId = intent.getIntExtra("id", -1);
        wait = findViewById(R.id.textView2);
=======
        SSCA = new Intent(StudentActivity.this,StudentSelectCourseActivity.class);
        SIS = new Intent(StudentActivity.this,StudentInquireScoreActivity.class);
        login = new Intent(StudentActivity.this,LoginActivity.class);
        wait = findViewById(R.id.textView2);
        selectCourse = findViewById(R.id.button2);
        inquireScore = findViewById(R.id.button3);
        logout = findViewById(R.id.button6);
>>>>>>> Stashed changes

    }
}