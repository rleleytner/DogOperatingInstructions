package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class REGenterBIRTHD extends AppCompatActivity {
    private EditText dateB;
    private Button backToGender, continueToAvatar;
    SPhelper s = new SPhelper();
    Checker check = new Checker();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regenter_birthd);
        dateB = findViewById(R.id.dateB);
        backToGender = findViewById(R.id.backToGender);
        continueToAvatar = findViewById(R.id.continueToAvatar);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.cust_toast_layout,(ViewGroup)findViewById(R.id.relativeLayout1));
        Toast toast = Toast.makeText(getApplicationContext(), "",Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
        backToGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setREGenterGENDERActivity(view);
            }
        });
        continueToAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String date = dateB.getText().toString();
                if(!date.equals("") && check.isDate(date)){
                    s.put(getApplicationContext(),"dateB", date);
                    setREGchooseAVATARActivity(view);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Вы не ввели дату или ввели ее неправильно!",Toast.LENGTH_LONG).show();
                }

            }
        });
    }
    public void setREGenterGENDERActivity(View view){
        Intent intent = new Intent(this, REGenterGENDER.class);
        startActivity(intent);
    }
    public void setREGchooseAVATARActivity(View view){
        Intent intent = new Intent(this, REGchooseAVATAR.class);
        startActivity(intent);
    }
}