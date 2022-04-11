package com.example.bmisimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class BMI_RESULT extends AppCompatActivity {
    TextView rw, rh, rcal1;
    int nw, nh, cal;
    String str1, str2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);
        rw = (TextView) findViewById(R.id.wid);
        rh = (TextView) findViewById(R.id.hid);

        // create the get Intent object
       Intent intent = getIntent();
       str1 = intent.getStringExtra("message_key1");
      str2 = intent.getStringExtra("message_key2");
        nw=Integer.parseInt(str1);
        nh=Integer.parseInt(str2);
        // display the string into textView
         cal=nw+nh;

        rh.setText(str1+str2);
        rcal1 = (TextView) findViewById(R.id.rcal);
        rcal1.setText(String.valueOf(cal));
//hey
    }
}


