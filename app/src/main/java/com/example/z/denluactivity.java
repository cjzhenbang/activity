package com.example.z;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class denluactivity extends AppCompatActivity {
private Button btu_1;
private Button btu_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denluactivity);
        btu_1=findViewById(R.id.but_1);
        btu_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(denluactivity.this,"登录成功",Toast.LENGTH_SHORT).show();
            }
        });
btu_2=findViewById(R.id.btn_1);
btu_2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(denluactivity.this,MainActivity.class);
        startActivity(intent);
    }
});
    }
}
