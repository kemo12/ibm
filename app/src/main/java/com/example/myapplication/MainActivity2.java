package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button b1;
    TextView sign_tv,tv_note;
    EditText user,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        b1= findViewById(R.id.login_b1);
        sign_tv=findViewById(R.id.signup_tv);
        user=findViewById(R.id.login_username_tv);
        pass =findViewById(R.id.login_password_tv);
        tv_note=findViewById(R.id.tv_note);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /*if (user.getText().toString()=="admin"&&pass.getText().toString()=="admin"){
                Intent intent= new Intent(getBaseContext(),list_status.class);
                startActivity(intent);}
               else {

                   tv_note.setVisibility(View.VISIBLE);
               }*/
                Intent intent= new Intent(getBaseContext(),list_status.class);
                startActivity(intent);
            }


        });
        sign_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}