package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class RelativeActivity extends AppCompatActivity {

    private Button mBtnrtm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        mBtnrtm = (Button)findViewById(R.id.rtm);
        mBtnrtm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_rtm = new Intent(RelativeActivity.this,MainActivity.class);
                startActivity(intent_rtm);
            }
        });
    }
}
