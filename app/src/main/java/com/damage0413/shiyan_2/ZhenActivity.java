package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ImageViewCompat;

import android.content.Intent;
import android.media.Image;
import android.media.ImageReader;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.service.autofill.ImageTransformation;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

public class ZhenActivity extends AppCompatActivity {

    private Button mBtnftm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhen);
        mBtnftm = (Button)findViewById(R.id.ftm);
        mBtnftm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_ftm = new Intent(ZhenActivity.this,MainActivity.class);
                startActivity(intent_ftm);
            }
        });
    }
}
