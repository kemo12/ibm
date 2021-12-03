package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewRecodr extends AppCompatActivity {
    Button b1 , kg_minus_bt,kg_plus_bt , cm_minus_bt , cm_plus_bt;
    int kg;
    int cm;
    TextView kg_tv, cm_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_recodr);

        kg_minus_bt = findViewById(R.id.newRecord_kg_minus_bt);
        kg_plus_bt = findViewById(R.id.newRecord_kg_plus_bt);
        cm_minus_bt = findViewById(R.id.newRecord_cm_minus_bt);
        cm_plus_bt = findViewById(R.id.newRecord_cm_plus_bt);
        kg_tv = findViewById(R.id.new_kg_tv);
        cm_tv=findViewById(R.id.new_cm_tv);
        kg_minus_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (kg==0){

                    kg=0;

                }
                else{
                    kg=kg-1;

                    kg_tv.setText(kg+"");
                }}
        });
        kg_plus_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kg=kg+1;
                kg_tv.setText(kg + "");
            }
        });
        cm_minus_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cm == 0)

                    cm= 0;

                else {
                    cm = cm - 1;
                    cm_tv.setText(cm + "");
                }

            }
        });

        cm_plus_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cm = cm +1;
                cm_tv.setText(cm+ "");
            }
        });

    }
}