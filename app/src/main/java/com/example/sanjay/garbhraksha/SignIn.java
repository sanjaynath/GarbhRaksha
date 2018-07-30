package com.example.sanjay.garbhraksha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    private EditText mAadhar,mName,mPhone,mPassword,mConfirmPassword;
    private Button mSignIn;
    private TextView mClickHere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        init();

        mClickHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Log_In.class));
            }
        });

    }
    void init(){
        mAadhar =(EditText) findViewById(R.id.adhaar);
        mName = (EditText)findViewById(R.id.name);
        mPhone = (EditText) findViewById(R.id.phone);
        mPassword = (EditText)findViewById(R.id.password);
        mConfirmPassword = (EditText)findViewById(R.id.confpassword);
        mSignIn = (Button)findViewById(R.id.signIn);
        mClickHere = (TextView)findViewById(R.id.signinlink);
    }
}
