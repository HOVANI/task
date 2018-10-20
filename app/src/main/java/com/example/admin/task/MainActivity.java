package com.example.admin.myapplication;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userName;
    private EditText lastName;
    private RadioGroup gender;
    private RadioButton fem;
    private RadioButton male;
    private Button done;
    private EditText email;
    private EditText passwd;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userName = findViewById(R.id.name);
        lastName = findViewById(R.id.lastn);
        gender = findViewById(R.id.genderGroup);
        fem =  findViewById(R.id.radioFemail);
        male =  findViewById(R.id.radioale);
        done = findViewById(R.id.buttonId);
        email = findViewById(R.id.emailId);
        passwd = findViewById(R.id.passwdId);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean g = false;
                if(gender.getCheckedRadioButtonId() == R.id.radioFemail){
                    g = true;
                } else {
                    g = false;
                }

                User somUser = new User(userName.getText().toString(), lastName.getText().toString(),
                        g, email.getText().toString(),passwd.getText().toString());
            }
        });
    }

}
