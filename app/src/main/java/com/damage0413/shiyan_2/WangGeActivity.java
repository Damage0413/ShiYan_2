package com.damage0413.shiyan_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class WangGeActivity extends AppCompatActivity {

    private Button mBtngtm;
    GridLayout gridLayout;
    String[] chars = new String[]
            {
                    "1" , "2" , "3" ,
                    "4" , "5" , "6" ,
                    "7" , "8" , "9" ,
                    "0" , "+" , "-" ,
                    "*" , "/" , "="
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wang_ge);
        gridLayout = (GridLayout)findViewById(R.id.gl);
        for(int i = 0 ; i < chars.length ; i++)
        {
            Button bn = new Button(this);
            bn.setText(chars[i]);
            bn.setTextSize(40);
            GridLayout.Spec rowSpec = GridLayout.spec(i / 3 );
            GridLayout.Spec columnSpec = GridLayout.spec(i % 3);
            GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec , columnSpec);
            gridLayout.addView(bn , params);
        }
        mBtngtm = (Button) findViewById(R.id.gtm);
        mBtngtm.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent_gtm = new Intent(WangGeActivity.this,MainActivity.class);
                startActivity(intent_gtm);
            }
        });
    }
}
