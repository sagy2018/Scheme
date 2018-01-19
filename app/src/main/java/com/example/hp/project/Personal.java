package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Personal extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        Spinner per=(Spinner) findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(Personal.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.personal));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        per.setAdapter(myAdapter);
        per.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long l) {
                if (i == 1) {
                    startActivity(new Intent(Personal.this, Clean.class));
                }  if (i == 2) {
                    startActivity(new Intent(Personal.this, Sports.class));
                } if (i==3) {
                    startActivity(new Intent(Personal.this,druger.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
