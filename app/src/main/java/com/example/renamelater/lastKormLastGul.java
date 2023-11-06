package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class lastKormLastGul extends AppCompatActivity {

    String LASTFEEDTIME, LASTWALKTIME;
    EditText lastFeed, lastWalk;
    Button endVetData, goBackToDates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_korm_last_gul);
        lastFeed = findViewById(R.id.lastFeed);
        lastWalk = findViewById(R.id.lastWalk);
        endVetData = findViewById(R.id.endVetData);
        goBackToDates = findViewById(R.id.goBackToDates);
        endVetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LASTFEEDTIME = lastFeed.getText().toString();
                LASTWALKTIME = lastWalk.getText().toString();
            }
        });
        goBackToDates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setenterVetProcActivity(view);
            }
        });
        endVetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFirstActivityInTheWorldActivity(view);
            }
        });
    }
    public void setenterVetProcActivity(View view){
        Intent intent = new Intent(this, enterVetProc.class);
        startActivity(intent);
    }
    public void setFirstActivityInTheWorldActivity(View view){
        Intent intent = new Intent(this, FirstActivityInTheWorld.class);
        intent.putExtra("ISSECOND","TRUE");
        startActivity(intent);
    }
}

