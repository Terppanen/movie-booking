package com.example.ttm.moviebooking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    Button loginB;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginB = (Button)findViewById(R.id.button);
        username = (EditText)findViewById(R.id.editText1);
        password = (EditText)findViewById(R.id.editText2);

        loginB.setOnClickListener(new View.OnClickListener() { //holy shit kattokaa millai tää menee :D tos normi sulje
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("timo") && password.getText().toString().equals("kissa123")) {
                    System.out.println("YOU HAVE KEYLOGGERED INTO TIMO gz");
                    //Tähän vissiin onnistunut kirjautuminen aka siirtminen main activityyn?
                }else{
                    System.out.println("HAHA eipä ollu xDD");
                    loginB.setEnabled(false);
                }
            }
        });

    }
}
