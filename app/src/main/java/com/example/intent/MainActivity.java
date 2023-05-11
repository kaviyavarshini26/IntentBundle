package com.example.intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name, password;
    TextView name1,pass1;

    Button click;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       name1=(TextView)findViewById(R.id.name1);
       pass1=(TextView) findViewById(R.id.password1);

        name =(EditText)findViewById(R.id.name2);
        password =(EditText)findViewById(R.id.password);
        click = (Button)findViewById(R.id.button);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                intent.putExtra("name", name.getText().toString());
                int mypass = Integer.parseInt(password.getText().toString());
                intent.putExtra("password", mypass);
                startActivity(intent);
            }
        });
    }
}