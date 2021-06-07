package com.example.sms.component;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.sms.R;
import com.example.sms.entity.Grade;

import java.util.List;

public class ScoreAdapter extends BaseAdapter {
    private List<Grade> ScoreList;
    private LayoutInflater inflater;

    public ScoreAdapter(Context context, List<Grade> ScoreList) {
        this.ScoreList = ScoreList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return ScoreList == null ? 0 : ScoreList.size();
    }

    @Override
    public Object getItem(int position) {
        return ScoreList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.score_item, null);
        Grade grade = (Grade) getItem(position);

        TextView courseName = view.findViewById(R.id.textView7);
        TextView courseScore = view.findViewById(R.id.textView8);

        courseName.setText(grade.getCourseName());
        Double finalGrade = grade.getFinalGrade();
        if (finalGrade == null)
            courseScore.setText("暂无");
        else
            courseScore.setText(String.valueOf(finalGrade));

        return view;
    }
}
