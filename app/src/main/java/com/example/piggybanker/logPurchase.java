package com.example.piggybanker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class logPurchase extends AppCompatActivity {

    double amount;
    String trans;

    EditText edit1;
    EditText edit2;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_purchase);
    }

    public void storeInMem(View v){
        finish();
    }

}
