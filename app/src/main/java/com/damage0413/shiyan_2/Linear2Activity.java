package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Linear2Activity extends AppCompatActivity {
    private Button mBtnl2tm;
    private Button mBtnl2t1;
    private Button mBtnl2t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_2);
        mBtnl2tm = (Button) findViewById(R.id.l2tm);
        mBtnl2tm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l2tm = new Intent(Linear2Activity.this, MainActivity.class);
                startActivity(intent_l2tm);
            }
        });
        mBtnl2t1 = (Button) findViewById(R.id.l2t1);
        mBtnl2t1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l2t1 = new Intent(Linear2Activity.this,LinearActivity.class);
                startActivity(intent_l2t1);
            }
        });
        mBtnl2t3 = (Button) findViewById(R.id.l2t3);
        mBtnl2t3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l2t3 = new Intent(Linear2Activity.this,Linear3Activity.class);
                startActivity(intent_l2t3);
            }
        });
    }
}
