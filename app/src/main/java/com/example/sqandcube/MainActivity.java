package com.example.sqandcube;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText t1 = (EditText) findViewById(R.id.num);
        TextView tv = (TextView) findViewById(R.id.textView1);
        TextView Result = (TextView) findViewById(R.id.result);
        Button B1 = (Button) findViewById(R.id.btn1);
        Button B2 = (Button) findViewById(R.id.btn2);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(t1.getText().toString().trim());
                int res = n1 * n1;
                Result.setText("Square::" + n1 + " is" + res);
                Toast.makeText(MainActivity.this, "Square is " + res, Toast.LENGTH_SHORT).show();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(t1.getText().toString().trim());
                int res = n1 * n1 * n1;
                Result.setText("Cube::" + n1 + " is " + res);
                Toast.makeText(MainActivity.this, "Cube is " + res, Toast.LENGTH_SHORT).show();
            }
            });
    }
}