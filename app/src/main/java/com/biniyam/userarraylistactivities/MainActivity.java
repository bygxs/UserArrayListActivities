package com.biniyam.userarraylistactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   /* final public static String USERS_KEY = "USERS";
    final public static String USER_KEY = "USER";*/
    //Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Main Activity");

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserActivity.class);
               // intent.putExtra("users",new User("Bob Smith",25));

                ArrayList<User> users = new ArrayList<>();
                users.add(new User("Bob Smith",22));
                users.add(new User("Sara Smith",21));
                users.add(new User("Robel Moges",33));
                users.add(new User("Yenesew Mera ",44));
                users.add(new User("Kendie Abebe",31));
                users.add(new User("Demam Yene",29));

                intent.putExtra("users",users);
                startActivity(intent);

            }
        });


    }
}