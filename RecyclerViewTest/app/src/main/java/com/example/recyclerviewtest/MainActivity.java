package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements ItemAdapter.MyInterface {
    RecyclerView rv;
    int totalAmount=0;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.recyclerview);
        button=findViewById(R.id.button);
        int[] images = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f, R.drawable.g, R.drawable.h, R.drawable.i, R.drawable.j};
        String[] itemNames = {"Rice","Chicken","Mutton","Papad","Potato","Dal","Gulab Jamun","Pickle","Custard","Curd"} ;
        String[] price={"100","150","200","30","50","60","20","10","30","25"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        ItemAdapter adapter = new ItemAdapter(this,images,itemNames,price,this);
        rv.setAdapter(adapter);

    }

    public void submit(View view) {
    }

    @Override
    public void selectedItems(String itemName, String itemPrice, int position, int totalPrice) {
        Toast.makeText(this, " "+totalPrice, Toast.LENGTH_SHORT).show();
        Log.i("TOTAL"," "+totalPrice);
        totalAmount=totalAmount+Integer.parseInt(itemPrice);
        button.setText(String.valueOf(totalAmount));

    }
}