package com.example.soundboard3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    EditText loginName;
    EditText loginPassword;
    Button loginBtn;
    TextView error;

    String username = "Ale";
    String lf = "1234";

    int count = 5;

    boolean isValid = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        loginName = (EditText) findViewById(R.id.loginName);
        loginPassword = (EditText) findViewById(R.id.loginPassword);
        loginBtn = (Button) findViewById(R.id.loginbtn);
        error = (TextView) findViewById(R.id.loginError);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lName = loginName.getText().toString();
                String lPassword = loginPassword.getText().toString();

                if(lName.isEmpty() || lPassword.isEmpty()){
                    error.setText("Username or Password is Empty");
                }
                else{

                    isValid = validate(lName, lPassword);

                    if(!isValid){
                        count --;
                        error.setText("Username or Password is incorrect");
                        if(count == 0){
                            loginName.setEnabled(true);
                        }

                        else{
                            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                            startActivity(intent);
                        }
                    }
                }
            }
        });
    }

    private boolean validate(String name, String password){
        if(name.equals(username) && password.equals(lf)){
            return true;
        }
        return false;
    }
}