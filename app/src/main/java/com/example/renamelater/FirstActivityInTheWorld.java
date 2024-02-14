package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;




public class FirstActivityInTheWorld extends AppCompatActivity {

    Button firstButtonInTheWorld;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity_in_the_world);
        firstButtonInTheWorld = findViewById(R.id.firstButtonInTheWorld);
        firstButtonInTheWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setREGenterNAMEActivity(view);
            }
        });

    }

    public void setREGenterNAMEActivity(View view){
        Intent intent = new Intent(this, REGenterNAME.class);
        startActivity(intent);
    }

}
