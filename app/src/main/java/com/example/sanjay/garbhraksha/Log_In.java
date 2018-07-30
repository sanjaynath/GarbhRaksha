package com.example.sanjay.garbhraksha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Log_In extends AppCompatActivity {

    private EditText mLogPhone,mLogPassword;
    private Button mLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log__in);
    }

    void init(){
        mLogIn = (Button) findViewById(R.id.loginbutton);
        mLogPassword = (EditText)findViewById(R.id.loginpassword);
        mLogPhone = (EditText)findViewById(R.id.loginphone);
    }
}
