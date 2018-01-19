package com.example.hp.project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Womgirl extends AppCompatActivity {
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    TextView t6;
    TextView t7;
    TextView t8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_womgirl);
        t1=(TextView) findViewById(R.id.textView67);
        t1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View view) {
                                      Intent i1 = new Intent(Womgirl.this, beti.class);
                                      startActivity(i1);
                                  }
                              }


     );
        t2=(TextView) findViewById(R.id.textView68);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2=new Intent(Womgirl.this,jsy.class);
                startActivity(i2);
            }
        });
        t3=(TextView) findViewById(R.id.textView69);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(Womgirl.this,rgs.class);
                startActivity(i3);
            }
        });
        t4=(TextView) findViewById(R.id.textView70);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(Womgirl.this,icds.class);
                startActivity(i4);
            }
        });
        t5=(TextView) findViewById(R.id.textView71);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(Womgirl.this,nnm.class);
                startActivity(i5);
            }
        });
        t6=(TextView) findViewById(R.id.textView72);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i6=new Intent(Womgirl.this,igmsy.class);
                startActivity(i6);
            }
        });
        t7=(TextView) findViewById(R.id.textView73);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i7=new Intent(Womgirl.this,nlm.class);
                startActivity(i7);
            }
        });
        t8=(TextView) findViewById(R.id.textView74);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i8=new Intent(Womgirl.this,mgrn.class);
            }
        });
    }
}
