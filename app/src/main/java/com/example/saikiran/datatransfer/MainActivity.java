package com.example.saikiran.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick2(View v)
    {
        Intent it = new Intent(MainActivity.this,Main2Activity.class);
        EditText e1=(EditText)findViewById(R.id.editText);
        String s=e1.getText().toString();
        it.putExtra("yo",s);
        startActivity(it);
            }
}
