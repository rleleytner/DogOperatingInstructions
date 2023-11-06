package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class AddVetData extends AppCompatActivity {

    private Button goToVet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_vet_data);
        goToVet = findViewById(R.id.goToVet);
        goToVet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setenterWeightActivity(view);
            }
        });
    }
    public void setenterWeightActivity(View view){
        Intent intent = new Intent(this, enterWeight.class);
        startActivity(intent);
    }

}