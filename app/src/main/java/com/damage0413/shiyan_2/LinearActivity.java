package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LinearActivity extends AppCompatActivity {
    private Button mBtnltm;
    private Button mBtnl2;
    private Button mBtnl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        mBtnltm = (Button) findViewById(R.id.ltm);
        mBtnltm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_ltm = new Intent(LinearActivity.this,MainActivity.class);
                startActivity(intent_ltm);
            }
        });
        mBtnl2 = (Button) findViewById(R.id.l2);
        mBtnl2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l2 = new Intent(LinearActivity.this,Linear2Activity.class);
                startActivity(intent_l2);
            }
        });
        mBtnl3 = (Button) findViewById(R.id.l3);
        mBtnl3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_l3 = new Intent(LinearActivity.this,Linear3Activity.class);
                startActivity(intent_l3);
            }
        });
    }
}
