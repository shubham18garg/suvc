package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username1, password1;
    private Button loginbtn, registerBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getting the on screen variables
        getUserLoginDetails();
        /*loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = username1.getText().toString();
                String password = password1.getText().toString();
                Log.d("LoginTag", "Got username and pass " + username +" " + password);
                String type = "login";
                BackgroundWorker backgroundWorker = new BackgroundWorker(this );
                backgroundWorker.execute(type, username, password);


                *//*if(validateParam()){
                    //verifying login details
                    if(validateUser()){
                        User user=new User(MainActivity.this); // this nd next line is for shared prefreance
                        user.setName(username.getText().toString());
                        startActivity(new Intent(MainActivity.this ,HomeActivity.class));
                    }
                    if(validateAdmin()){
                        startActivity(new Intent(MainActivity.this ,AdminActivity.class));
                    }
                }*//*


            }
        });
*/

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });
    }
    public void OnLogin(View view) {
        String user_login = username1.getText().toString();
        String user_pass = password1.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, user_login, user_pass);
    }
    /*private boolean validateUser() {
        boolean validateUser = false;
        if(username.getText().toString().equals("a") && password.getText().toString().equals("a")){
            validateUser = true;
        }
        return validateUser;
    }
    private boolean validateAdmin() {
        boolean validateAdmin = false;
        if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            validateAdmin = true;
        }
        return validateAdmin;
    }



    private boolean validateParam() {
        boolean validate = false;
        if(username.getText().toString().isEmpty() && password.getText().toString().isEmpty()){
            Toast.makeText(this,"Please enter the details",Toast.LENGTH_SHORT).show();
        }else{
            validate = true;
        }
        return validate;
    }*/

    private void getUserLoginDetails(){
        username1 = findViewById(R.id.username);
        password1 = findViewById(R.id.password);
        loginbtn = findViewById(R.id.loginBtn);
        registerBtn = findViewById(R.id.registerBtn);
    }
    }

