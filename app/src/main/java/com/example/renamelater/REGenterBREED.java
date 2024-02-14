package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class REGenterBREED extends AppCompatActivity {
    private SPhelper s = new SPhelper();
    private Spinner chooseBreed;
    private Button backToName, continueToGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regenter_breed);
        chooseBreed = findViewById(R.id.chooseBreed);
        backToName = findViewById(R.id.backToName);
        continueToGender = findViewById(R.id.continueToGender);

        backToName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setREGenterNAMEActivity(view);
            }
        });
        continueToGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String choosenbreed = chooseBreed.getSelectedItem().toString();
                s.put(getApplicationContext(), "breed", choosenbreed);
                setREGenterGENDERActivity(view);
            }
        });
    }
    public void setREGenterNAMEActivity(View view){
        Intent intent = new Intent(this, REGenterNAME.class);
        startActivity(intent);
    }
    public void setREGenterGENDERActivity(View view){
        Intent intent = new Intent(this, REGenterGENDER.class);
        startActivity(intent);
    }
}