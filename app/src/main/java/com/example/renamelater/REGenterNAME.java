package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class REGenterNAME extends AppCompatActivity {
    private Button approveName;
    private EditText nameOfDog;
    private SPhelper s = new SPhelper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regenter_name);
        approveName = findViewById(R.id.ApproveName);
        nameOfDog = findViewById(R.id.nameOfDog);
        approveName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameOfDog.getText().toString();
                if(!name.equals("")){
                    s.put(getApplicationContext(),"name",nameOfDog.getText().toString());
                    setREGenterBREEDActivity(view);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Вы не ввели имя!",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public void setREGenterBREEDActivity(View view){
        Intent intent = new Intent(this, REGenterBREED.class);
        startActivity(intent);
    }
}