package com.example.bmisimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class BMI_RESULT extends AppCompatActivity {
   TextView result;
   Button goback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);
        result = (TextView) findViewById(R.id.result);
        goback=(Button)findViewById(R.id.button2);


        // create the get Intent object
       Intent intent = getIntent();
       String str1 = intent.getStringExtra("BMI");
        result.setText(str1);

goback.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(BMI_RESULT.this, MainActivity.class);
        startActivity(intent);
    }
});
    }
}


