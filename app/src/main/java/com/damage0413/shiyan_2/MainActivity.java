package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnll;
    private Button mBtnrl;
    private Button mBtnz;
    private Button mBtnbg;
    private Button mBtnwg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnll = (Button) findViewById(R.id.ll);
        mBtnll.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_ll = new Intent(MainActivity.this,LinearActivity.class);
                startActivity(intent_ll);
            }
        });
        mBtnrl = (Button) findViewById(R.id.rl);
        mBtnrl.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_rl = new Intent(MainActivity.this,RelativeActivity.class);
                startActivity(intent_rl);
            }
        });
        mBtnz = (Button) findViewById(R.id.zheng);
        mBtnz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_z = new Intent(MainActivity.this,ZhenActivity.class);
                startActivity(intent_z);
            }
        });
        mBtnbg = (Button) findViewById(R.id.BiaoGe);
        mBtnbg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_bg = new Intent(MainActivity.this,BiaoGeActivity.class);
                startActivity(intent_bg);
            }
        });
        mBtnwg = (Button) findViewById(R.id.WangGe);
        mBtnwg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_wg = new Intent(MainActivity.this,WangGeActivity.class);
                startActivity(intent_wg);
            }
        });
    }
}
