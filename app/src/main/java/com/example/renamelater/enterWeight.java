package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class enterWeight extends AppCompatActivity {

    private EditText weightOfDog;
    private Button nextVet;
    public SPhelper s = new SPhelper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_weight);
        weightOfDog = findViewById(R.id.weightOfDog);
        nextVet = findViewById(R.id.nextVet);
        nextVet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.put(getApplicationContext(), "weight", weightOfDog.getText().toString());
                setAddIllnessesActivity(view);
            }
        });
    }
    public void setAddIllnessesActivity(View view) {
        Intent intent = new Intent(this, addIllnesses.class);
        startActivity(intent);
    }

}