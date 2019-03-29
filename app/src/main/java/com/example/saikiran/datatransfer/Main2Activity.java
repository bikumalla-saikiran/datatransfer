package com.example.saikiran.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView t1=findViewById(R.id.textView2);
        Intent it1 =getIntent();
        String s1=it1.getStringExtra("yo");
        t1.setText(s1);
        Toast.makeText(getApplicationContext(),s1,100).show();

    }
}
