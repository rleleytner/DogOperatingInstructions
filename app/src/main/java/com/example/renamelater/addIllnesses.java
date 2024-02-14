package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class addIllnesses extends AppCompatActivity {

    private Button vetWeight, vetProc;
    private EditText illnessesOfTheDog;
    SPhelper s = new SPhelper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_illnesses);
        vetWeight=findViewById(R.id.vetWeight);
        vetProc = findViewById(R.id.vetProc);
        illnessesOfTheDog = findViewById(R.id.illnessesOfTheDog);
        vetWeight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setenterWeightActivity(view);
            }
        });
        vetProc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.put(getApplicationContext(), "illnesses",illnessesOfTheDog.getText().toString());
                setenterVetProcActivity(view);
            }
        });
    }
    public void setenterWeightActivity(View view) {
        Intent intent = new Intent(this, enterWeight.class);
        startActivity(intent);
    }
    public void setenterVetProcActivity(View view){
        Intent intent = new Intent(this, enterVetProc.class);
        startActivity(intent);
    }
}