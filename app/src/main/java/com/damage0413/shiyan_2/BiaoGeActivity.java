package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BiaoGeActivity extends AppCompatActivity {

    private Button mBtnttm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biao_ge);
        mBtnttm = (Button) findViewById(R.id.ttm);
        mBtnttm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_ttm = new Intent(BiaoGeActivity.this,MainActivity.class);
                startActivity(intent_ttm);
            }
        });
    }
}
