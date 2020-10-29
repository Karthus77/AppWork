package com.example.app1test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnalyseActivity extends AppCompatActivity {
    private TextView mathSuggestion;
    private TextView EnglishSuggestion;
    private TextView cSuggestion;
    private TextView csSuggestion;
    private ImageView back;
    private TextView suggestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analyse);
        TextView mathSuggestion=findViewById(R.id.mathSuggestion);
        TextView EnglishSuggestion=findViewById(R.id.EnglishSuggestion);
        TextView cSuggestion=findViewById(R.id.cSuggestion);
        TextView csSuggestion=findViewById(R.id.csSuggestion);
        TextView suggestion=findViewById(R.id.suggestion);
        ImageView back=findViewById(R.id.enterBack2);
        Intent it2=getIntent();//获得数据
        Bundle bt=it2.getExtras();
        int Math=bt.getInt("Math");
        int English=bt.getInt("English");
        int C=bt.getInt("C");
        int CS=bt.getInt("CS");
        double grade=bt.getDouble("overall");
        double fangCha=bt.getDouble("fc");
        if(grade>=80&&fangCha<=4)
        {
            suggestion.setText("你的总体成绩表现为优秀，各科成绩比较稳定");
        }
        else if(grade>80&&fangCha>4)
        {
            suggestion.setText("你的总体成绩表现为优秀，但存在偏科现象，请注意！");
        }
        else if(grade>70&&fangCha>4&&fangCha<10)
        {
            suggestion.setText("你的成绩一般且存在偏科现象，请注意！");
        }
        else if(grade>70&&fangCha<=4)
        {
            suggestion.setText("你的成绩一般,但还好比较稳定");
        }
        else if(grade>70&&fangCha>=10)
        {
            suggestion.setText("你的成绩一般，但偏科有点严重啊！");
        }
        else if(grade>60)
        {
            suggestion.setText("好好学习吧，你还是有机会的");
        }
        else
        {
            suggestion.setText("小伙子，你这成绩就不用我给你分析了吧！");
        }
        if(Math>=90)
        {
            mathSuggestion.setText("建议:成绩表现优异，继续努力！");
        }
        else  if(Math>=80)
        {
            mathSuggestion.setText("建议:成绩表现不错，继续加油！");
        }
        else if(Math>=70)
        {
            mathSuggestion.setText("建议:你的进步空间还很大，好好加油吧！");
        }
        else if(Math>=60)
        {
            mathSuggestion.setText("建议:你已经处在挂科边缘了!!!");
        }
        else
        {
            mathSuggestion.setText("挂科快乐!补考加油!");
        }
        if(English>=90)
        {
            EnglishSuggestion.setText("建议:成绩表现优异，继续努力！");
        }
        else  if(English>=80)
        {
            EnglishSuggestion.setText("建议:成绩表现不错，继续加油！");
        }
        else if(English>=70)
        {
            EnglishSuggestion.setText("建议:你的进步空间还很大，好好加油吧！");
        }
        else if(English>=60)
        {
            EnglishSuggestion.setText("建议:你已经处在挂科边缘了!!!");
        }
        else
        {
            EnglishSuggestion.setText("挂科快乐!补考加油!");
        }
        if(C>=90)
        {
            cSuggestion.setText("建议:成绩表现优异，继续努力！");
        }
        else  if(C>=80)
        {
            cSuggestion.setText("建议:成绩表现不错，继续加油！");
        }
        else if(C>=70)
        {
            cSuggestion.setText("建议:你的进步空间还很大，好好加油吧！");
        }
        else if(C>=60)
        {
            cSuggestion.setText("建议:你已经处在挂科边缘了!!!");
        }
        else
        {
            cSuggestion.setText("挂科快乐!补考加油!");
        }
        if(CS>=90)
        {
            csSuggestion.setText("建议:成绩表现优异，继续努力！");
        }
        else  if(CS>=80)
        {
            csSuggestion.setText("建议:成绩表现不错，继续加油！");
        }
        else if(CS>=70)
        {
            csSuggestion.setText("建议:你的进步空间还很大，好好加油吧！");
        }
        else if(CS>=60)
        {
            csSuggestion.setText("建议:你已经处在挂科边缘了!!!");
        }
        else
        {
            csSuggestion.setText("挂科快乐!补考加油!");
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}