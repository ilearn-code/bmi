package com.example.bmisimple;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText rw,rh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button move = findViewById(R.id.move);
        rw=(EditText) findViewById(R.id.editTextNumberDecimal);
        rh=(EditText) findViewById(R.id.editTextNumberDecimal2);


        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(rw.getText().toString());
                double num2 = Double.parseDouble(rh.getText().toString());

                double BMI =num1/(num2*num2);
                String str= Double.toString(BMI);

                Intent intent = new Intent(MainActivity.this, BMI_RESULT.class);
                intent.putExtra("BMI",str);
                startActivity(intent);

            }
            //hi


        });
    }
}