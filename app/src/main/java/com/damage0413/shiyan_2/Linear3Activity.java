package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Linear3Activity extends AppCompatActivity {
    private Button mBtnl3tm;
    private Button mBtnl3t1;
    private Button mBtnl3t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_3);
        mBtnl3tm = (Button)findViewById(R.id.l3tm);
        mBtnl3tm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l3tm = new Intent(Linear3Activity.this, MainActivity.class);
                startActivity(intent_l3tm);
            }
        });
        mBtnl3t1 = (Button)findViewById(R.id.l3t1);
        mBtnl3t1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l3t1 = new Intent(Linear3Activity.this, LinearLayout.class);
                startActivity(intent_l3t1);
            }
        });
        mBtnl3t2 = (Button)findViewById(R.id.l3t2);
        mBtnl3t2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l3t2 = new Intent(Linear3Activity.this, Linear2Activity.class);
                startActivity(intent_l3t2);
            }
        });
    }
}
