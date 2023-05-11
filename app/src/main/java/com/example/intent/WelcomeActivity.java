package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    TextView tv1;
    Button btn;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tv1 = (TextView) findViewById(R.id.welcome);
        btn = (Button) findViewById(R.id.back);
        Bundle bundle = null;
        bundle = getIntent().getExtras();
        if (bundle != null) {
            String myname = bundle.getString("name");
            int mypass = bundle.getInt("password", 0);
            tv1.setText(myname+ "has following " +mypass);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });
    }


}