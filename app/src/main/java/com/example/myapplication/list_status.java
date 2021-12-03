package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class list_status extends AppCompatActivity {
            ListView status_list;
            TextView rate_status_tv;
            Button add_record_bt , add_food_bt ,view_list_bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_status);
        status_list =findViewById(R.id.status_list);
        rate_status_tv = findViewById(R.id.statusRate_tv);
        ArrayList<customStatus> s = new ArrayList<>();

        s.add(new customStatus("1999/3/18", 80,"normal",177));
        s.add(new customStatus("1999/3/18", 80,"normal",177));
        s.add(new customStatus("1999/3/18", 80,"normal",177));
        s.add(new customStatus("1999/3/18", 80,"normal",177));

        statusAdapter sAdapter  = new statusAdapter(this,R.layout.custom_status_layout,s);

        status_list.setAdapter(sAdapter);
        rate_status_tv.setText("normal (still good )");
    }
}