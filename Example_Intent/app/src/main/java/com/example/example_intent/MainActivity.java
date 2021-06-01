package com.example.example_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,phone,link;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        link=findViewById(R.id.link);
    }

    public void next(View view) {
        String n=name.getText().toString();
        Intent i=new Intent(this,SecondActivity.class);
        i.putExtra("key",n);
        startActivity(i);
    }

    public void dial(View view) {
        String n= phone.getText().toString();
        Uri uri=Uri.parse("tell:"+n);
        Intent i=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(i);
    }

    public void link(View view) {
        String n= link.getText().toString();
        Uri uri =Uri.parse("https://"+n);
        Intent i=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
}