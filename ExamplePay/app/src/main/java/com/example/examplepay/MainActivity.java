package com.example.examplepay;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.ETC1;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity implements PaymentResultListener {
    EditText cname,camount;
    Checkout checkout;
    String apikey;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cname=findViewById(R.id.cname);
        camount=findViewById(R.id.camount);

    }

    public void pay(View view) {
        apikey="rzp_test_1F2iZvB7tcUGG9";
        String name=cname.getText().toString();
        String amount=camount.getText().toString();
        checkout=new Checkout();
        checkout.setKeyID(apikey);

        try {
            JSONObject object=new JSONObject();
            object.put("name",name);
            object.put("amount",amount);
            object.put("currency","INR");
            object.put("description","This is the payment gateway");
            checkout.open(this,object);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onPaymentSuccess(String s) {
        Log.i("APSSDC",s);
        //Toast.makeText(this, ""+s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPaymentError(int i, String s) {
        Log.i("APSSDC",s);

    }
}