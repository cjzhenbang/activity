package com.example.z;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

private TextView tv_1,tv_2,tv_3,tv_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_3=findViewById(R.id.tve_3);
        tv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,denluactivity.class);
                startActivity(intent);
            }
        });
        tv_1 =findViewById(R.id.tve_1);
        tv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"新浪微博",Toast.LENGTH_LONG).show();
            }
        });
        tv_2=findViewById(R.id.tve_2);
        tv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"腾讯微博",Toast.LENGTH_LONG).show();
            }
        });
        tv_4=findViewById(R.id.tve_4);
       tv_4.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,zhuceactivity.class);
               startActivity(intent);
           }
       });

    }
}
