package com.example.app1test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class InputActivity extends AppCompatActivity {
    private Button bt;
    private EditText EdM;
    private EditText EdE;
    private EditText EdC;
    private EditText EdCS;
    private EditText gradMath;
    private EditText gradC;
    private EditText gradCS;
    private EditText gradEnglish;
    private ImageView guide;
    private ImageView page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        bt = (Button) this.findViewById(R.id.EnterNext);
        EdM = this.findViewById(R.id.EnterMath);
        EdE = this.findViewById(R.id.EnterEnglish);
        EdC = this.findViewById(R.id.EnterC);
        EdCS = this.findViewById(R.id.EnterComputer);
        gradMath =findViewById(R.id.gradeMath);
        gradC = findViewById(R.id.gradeC);
        gradEnglish =findViewById(R.id.gradeEnglish);
        gradCS =findViewById(R.id.gradeCS);
        guide =findViewById(R.id.guide);
        page =findViewById(R.id.page);
        guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InputActivity .this,"详情请查阅使用说明",Toast.LENGTH_LONG).show();
            }
        });
        page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(InputActivity.this,"这个按键只是一个摆设",Toast.LENGTH_LONG).show();
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String math =EdM.getText().toString();
                String English = EdE.getText().toString();
                String C = EdC.getText().toString();
                String CS = EdCS.getText().toString();
                String gMath =gradMath.getText().toString();
                String gEnglish =gradEnglish.getText().toString();
                String gCl=gradC.getText().toString();
                String gCS1=gradCS.getText().toString();
                int gM= Integer.parseInt(gMath);
                int gE= Integer.parseInt(gEnglish);
                int gC = Integer.parseInt(gCl);
                int gCS =Integer.parseInt(gCS1);
                int m = Integer.parseInt(math);
                int E = Integer.parseInt(English);
                int c = Integer.parseInt(C);
                int cs = Integer.parseInt(CS);
                if (m <=100 && m >= 0 && E <= 100 && E >= 0 && c <= 100 && c >= 0 && cs >= 0 && cs <= 100&&gM<=10&&gM>=0&&gE<=10&&gE>=0&&gC<=10&&gC>=0&&gCS>=0&&gCS<=10) {
                    Toast.makeText(InputActivity.this,"生成成功!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(InputActivity.this, ReportActivity.class);
                    Bundle bd =new Bundle();
                    bd.putInt("gradeMath",gM);
                    bd.putInt("gradeC",gC);
                    bd.putInt("gradeEnglish",gE);
                    bd.putInt("gradeCS",gCS);
                    bd.putInt("math",m);
                    bd.putInt("English",E);
                    bd.putInt("C",c);
                    bd.putInt("CS",cs);
                    intent.putExtras(bd);
                    startActivity(intent);

                } else {
                    Toast.makeText(InputActivity.this, "请正确输入!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
