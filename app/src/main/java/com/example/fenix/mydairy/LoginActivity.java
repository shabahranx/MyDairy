package com.example.fenix.mydairy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * This method is executed when the login button is clicked
     */
    public void login(View v) {
        Intent intent1 = new Intent(LoginActivity.this, Main2Activity.class);
        startActivity(intent1);

    }

    public void signUp(View v) {
        Intent intent2 = new Intent(LoginActivity.this, Main2Activity.class);
        startActivity(intent2);

    }
}
