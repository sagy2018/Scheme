package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class Human extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_human);

        Spinner hum=(Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> myAdapter=new ArrayAdapter<String>(Human.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.human));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hum.setAdapter(myAdapter);
        hum.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1){
                    startActivity(new Intent(Human.this,Womgirl.class));
                } if (i==2){
                    startActivity(new Intent(Human.this,health.class));
                } if (i==3){
                    startActivity(new Intent(Human.this,PWD.class));

                }if (i==4){
                    startActivity(new Intent(Human.this,claten.class));
                } if (i==5){
                    startActivity(new Intent(Human.this,eedu.class));
                } if (i==6){
                    startActivity(new Intent(Human.this,adulit.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
