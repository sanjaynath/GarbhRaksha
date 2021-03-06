package com.example.sanjay.garbhraksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //members

    private ImageView background;
    private Button anganSignIn;
    private Button motherSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       init();
       motherSignIn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),Home.class));
           }
       });

        anganSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AnganWadi_page.class));
            }
        });

    }
    void init(){
        background = (ImageView) findViewById(R.id.background);
        anganSignIn = (Button) findViewById(R.id.anganwadisignin);
        motherSignIn = (Button) findViewById(R.id.mothersignin);
    }
}
