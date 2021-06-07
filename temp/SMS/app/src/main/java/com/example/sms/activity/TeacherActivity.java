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
public class TeacherActivity extends AppCompatActivity {

    private int userId;
    private TextView wait;
    private Intent intent ;
=======
import static com.example.sms.component.CONST.userId;

public class TeacherActivity extends AppCompatActivity {

    private Intent teacherRecord;
    private int userId;
    private Button record;
    private TextView wait;
    private Intent intent ;
    private Button logout;
    private Intent login;
>>>>>>> Stashed changes
    Gson gson =new Gson();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        init();
        setMethod();
    }

    private void setMethod() {
<<<<<<< Updated upstream

=======
        record.setOnClickListener((View v)->{
            startActivity(teacherRecord);
//            finish();
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
        userId = intent.getIntExtra("id", -1);
<<<<<<< Updated upstream
        wait = findViewById(R.id.textView3);
=======
        record = findViewById(R.id.button4);
        login = new Intent(TeacherActivity.this,LoginActivity.class);
        teacherRecord = new Intent(TeacherActivity.this,TeacherRecordActivity.class);
        logout = findViewById(R.id.button7);
//        wait = findViewById(R.id.textView3);
>>>>>>> Stashed changes

    }
}