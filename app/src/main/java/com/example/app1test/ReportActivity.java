package com.example.app1test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {
    private ImageView imageView;
    private ImageView enterBack;
    private TextView scoreMath;
    private TextView gpaMath;
    private TextView rateMath;
    private TextView scoreEnglish;
    private TextView gpaEnglish;
    private TextView rateEnglish;
    private TextView scoreC;
    private TextView gpaC;
    private TextView rateC;
    private TextView scoreCS;
    private TextView gpaCS;
    private TextView rateCS;
    private TextView stability;
    private TextView totalScore;
    private TextView totalGpa;
    private TextView overallRank;
    private TextView weightScore;
    private TextView stabilityResult;
    private TextView overallRankResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        imageView=(ImageView)findViewById(R.id.AnalyseEnter);//绑定
        enterBack =(ImageView)findViewById(R.id.enterBack1);
            TextView scoreMath=findViewById(R.id.scoreMath);
            TextView gpaMath=findViewById(R.id.gpaMath);
            TextView rateMath=findViewById(R.id.rateMath);
            TextView scoreEnglish=findViewById(R.id.scoreEnglish);
            TextView gpaEnglish=findViewById(R.id.gpaEnglish);
            TextView rateEnglish=findViewById(R.id.rateEnglish);
            TextView scoreC=findViewById(R.id.scoreC);
            TextView gpaC=findViewById(R.id.gpaC);
            TextView rateC=findViewById(R.id.rateC);
            TextView scoreCS=findViewById(R.id.scoreCS);
            TextView gpaCS=findViewById(R.id.gpaCS);
            TextView rateCS=findViewById(R.id.rateCS);
            TextView stability=findViewById(R.id.stability);
            TextView totalScore=findViewById(R.id.totalScore);
            TextView totalGpa=findViewById(R.id.totalGpa);
            TextView overallRank=findViewById(R.id.overallRank);
            TextView weightScore=findViewById(R.id.weightScore);
            TextView stabilityResult=findViewById(R.id.stabilityResult);
            final TextView overallRankResult=findViewById(R.id.overallRankResult);
        Intent it1=getIntent();
        Bundle bd=it1.getExtras();//获得输入数据
        final int math=bd.getInt("math");
        final int English=bd.getInt("English");
        final int c=bd.getInt("C");
        final int cs=bd.getInt("CS");
        int gradeMath=bd.getInt("gradeMath");
        int gradeEnglish=bd.getInt("gradeEnglish");
        int gradeC=bd.getInt("gradeC");
        int gradeCS=bd.getInt("gradeCS");
        double XueFen=gradeC+gradeCS+gradeEnglish+gradeMath; //总学分
        String resultScore=String.format("%.2f",XueFen);
        totalScore.setText("总学分:"+String.valueOf(resultScore));
        final double WeightGrade=(math*gradeMath+English*gradeEnglish+c*gradeC+cs*gradeCS)/XueFen;//加权平均分
        String resultGrade=String.format("%.1f",WeightGrade);
        weightScore.setText(String.valueOf(resultGrade));
        if(WeightGrade>=90)
        {
            overallRankResult.setText("A");
        }
        else if(WeightGrade>=85)
        {
            overallRankResult.setText("B");
        }
        else if(WeightGrade>=75)
        {
            overallRankResult.setText("C");
        }
        else if(WeightGrade>=60)
        {
            overallRankResult.setText("D");
        }
        else
        {
            overallRankResult.setText("E");
        }
        scoreMath.setText("成绩:"+String.valueOf(math));
        scoreEnglish.setText("成绩:"+String.valueOf(English));
        scoreC.setText("成绩:"+String.valueOf(c));
        scoreCS.setText("成绩:"+String.valueOf(cs));
        double gpa1,gpa2,gpa3,gpa4;
        if(English>=90)
        {   gpa1=4.0;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("A ");
        }
        else if(English>=86)
        {   gpa1=3.7;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("A-");
        }
        else if (English>=83)
        {
            gpa1=3.3;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("B+");
        }
        else if(English>=80)
        {
            gpa1=3.0;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("B ");
    }
        else if(English>=76)
        {
            gpa1=2.7;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("B-");
        }
        else if(English>=73)
        {
            gpa1=2.3;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("C+");
        }
        else if(English>=70)
        {
            gpa1=2.0;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("C ");
        }
        else if(English>=66)
        {
            gpa1=1.7;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("C-");
        }
        else if(English>=63)
        {
            gpa1=1.3;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("D+");
        }
        else if(English>=60)
        {
            gpa1=1.0;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("D ");
        }
        else
        {
            gpa1=0;
            gpaEnglish.setText("绩点:"+gpa1);
            rateEnglish.setText("F ");
        }
        if(math>=90)
        {
            gpa2=4.0;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("A ");
        }
        else if(math>=86)
        {
            gpa2=3.7;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("A-");
        }
        else if (math>=83)
        {
            gpa2=3.3;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("B+");
        }
        else if(math>=80)
        {
            gpa2=3.0;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("B ");
        }
        else if(math>=76)
        {
            gpa2=2.7;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("B-");
        }
        else if(math>=73)
        {
            gpa2=2.3;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("C+");
        }
        else if(math>=70)
        {
            gpa2=2.0;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("C ");
        }
        else if(math>=66)
        {
            gpa2=1.7;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("C-");
        }
        else if(math>=63)
        {
            gpa2=1.3;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("D+");
        }
        else if(math>=60)
        {
            gpa2=1.0;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("D ");
        }
        else
        {
            gpa2=0;
            gpaMath.setText("绩点:"+gpa2);
            rateMath.setText("F ");
        }
        if(c>=90)
        {
            gpa3=4.0;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("A ");
        }
        else if(c>=86)
        {
            gpa3=3.7;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("A-");
        }
        else if (c>=83)
        {
            gpa3=3.3;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("B+");
        }
        else if(c>=80)
        {
            gpa3=3.0;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("B ");
        }
        else if(c>=76)
        {
            gpa3=2.7;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("B-");
        }
        else if(c>=73)
        {
            gpa3=2.3;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("C+");
        }
        else if(c>=70)
        {
            gpa3=2.0;
            gpaMath.setText("绩点:"+gpa3);
            rateC.setText("C ");
        }
        else if(c>=66)
        {
            gpa3=1.7;
            gpaMath.setText("绩点:"+gpa3);
            rateC.setText("C-");
        }
        else if(c>=63)
        {
            gpa3=1.3;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("D+");
        }
        else if(c>=60)
        {
            gpa3=1.0;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("D ");
        }
        else
        {
            gpa3=0;
            gpaC.setText("绩点:"+gpa3);
            rateC.setText("F ");
        }
        if(cs>=90)
        {
            gpa4=4.0;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("A ");
        }
        else if(cs>=86)
        {
            gpa4=3.7;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("A-");
        }
        else if (cs>=83)
        {
            gpa4=3.3;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("B+");
        }
        else if(cs>=80)
        {
            gpa4=3.0;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("B ");
        }
        else if(cs>=76)
        {
            gpa4=2.7;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("B-");
        }
        else if(cs>=73)
        {
            gpa4=2.3;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("C+");
        }
        else if(cs>=70)
        {
            gpa4=2.0;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("C ");
        }
        else if(cs>=66)
        {
            gpa4=1.7;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("C-");
        }
        else if(cs>=63)
        {
            gpa4=1.3;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("D+");
        }
        else if(cs>=60)
        {
            gpa4=1.0;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("D ");
        }
        else
        {
            gpa4=0;
            gpaCS.setText("绩点:"+gpa4);
            rateCS.setText("F ");
        }
        double jiDian=(gpa1*gradeEnglish+gpa2*gradeMath+gpa3*gradeC+gpa4*gradeCS)/XueFen;//总绩点
        String result=String.format("%.2f",jiDian);
        totalGpa.setText("总绩点:"+ String.valueOf(result));
        final double fangCha=((math-WeightGrade)*(math-WeightGrade)+(English-WeightGrade)*(English-WeightGrade)+(c-WeightGrade)*(c-WeightGrade)+(cs-WeightGrade)*(cs-WeightGrade))/4;//方差
        if(fangCha>10)
        {
            stabilityResult.setText("差");
        }
        else if(fangCha>4)
        {
            stabilityResult.setText("较差");
        }
        else if(fangCha>1)
        {
            stabilityResult.setText("良好");
        }
        else
        {
            stabilityResult.setText("优秀");
        }
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(ReportActivity.this,AnalyseActivity.class);
                Bundle bt=new Bundle();
                bt.putInt("Math",math);
                bt.putInt("English",English);
                bt.putInt("C",c);
                bt.putInt("CS",cs);
                bt.putDouble("overall",WeightGrade);
                bt.putDouble("fc",fangCha);
                intent2.putExtras(bt);
                startActivity(intent2);
            }
        });
        enterBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}