package com.biniyam.userarraylistactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class UserActivity extends AppCompatActivity {

    TextView textViewGreeting;
   // Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        textViewGreeting =findViewById(R.id.textViewGreeting);

        if(getIntent() !=null && getIntent().getExtras() !=null && getIntent().hasExtra("users")) {
            ArrayList<User> users = (ArrayList<User>) getIntent().getSerializableExtra("users");
            Collections.shuffle(users);
            User user =users.get(0);
            textViewGreeting.setText("Hello " + user.name);
        }

        setTitle("User Activity");
        findViewById(R.id.button2).setOnClickListener(v -> {finish();});
    }

}
