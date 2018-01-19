package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Sports extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        t1=(TextView) findViewById(R.id.textView10);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(Sports.this,Khel.class);
                startActivity(i1);


            }


            });
        t2=(TextView)findViewById(R.id.textView16);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Sports.this,Spoamdis.class);
                startActivity(i2);
            }
        });
        t3=(TextView)findViewById(R.id.textView24);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Sports.this,Gandhi.class);
                startActivity(i3);
            }
        });

    }
}
