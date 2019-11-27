package com.example.z;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class zhuceactivity extends AppCompatActivity {
private Button btu_1;
private Button btu_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuceactivity);

        btu_1=findViewById(R.id.btn_register);
        btu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(zhuceactivity.this,"注册成功",Toast.LENGTH_SHORT).show();
            }
        });
        btu_2=findViewById(R.id.btn_2);
        btu_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(zhuceactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
