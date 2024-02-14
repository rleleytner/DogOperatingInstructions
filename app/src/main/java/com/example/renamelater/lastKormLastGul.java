package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class lastKormLastGul extends AppCompatActivity {

    String LASTFEEDTIME, LASTWALKTIME;
    EditText lastFeed, lastWalk;
    Button endVetData, goBackToDates;

    SPhelper s = new SPhelper();
    Checker c = new Checker();
    DateTimeCalc dt = new DateTimeCalc();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last_korm_last_gul);
        lastFeed = findViewById(R.id.lastFeed);
        lastWalk = findViewById(R.id.lastWalk);
        endVetData = findViewById(R.id.endVetData);
        goBackToDates = findViewById(R.id.goBackToDates);
        Toast.makeText(getApplicationContext(), "Собаку необходимо выгуливать раз в 12 часов!",Toast.LENGTH_SHORT).show();
        endVetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(true){
                    LASTFEEDTIME = lastFeed.getText().toString();
                    LASTWALKTIME = lastWalk.getText().toString();
                    s.put(getApplicationContext(), "lastfeedtime",LASTFEEDTIME);
                    s.put(getApplicationContext(), "lastwalktime", LASTWALKTIME);
                    String tempHours = LASTWALKTIME.substring(0,LASTWALKTIME.indexOf(':'));
                    if(Integer.valueOf(tempHours)<=12){
                        s.put(getApplicationContext(),"morning_gul",LASTWALKTIME);
                        s.put(getApplicationContext(),"evening_gul",dt.plusTime(LASTWALKTIME,"12:00"));
                    }
                    else{
                        s.put(getApplicationContext(),"evening_gul",LASTWALKTIME);
                        s.put(getApplicationContext(),"morning_gul",dt.plusTime(LASTWALKTIME,"12:00"));
                    }
                    setMenuActivity(view);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Вы ввели время неправильно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
                }
            }
        });
        goBackToDates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setenterVetProcActivity(view);
            }
        });
    }
    public void setenterVetProcActivity(View view){
        Intent intent = new Intent(this, enterVetProc.class);
        startActivity(intent);
    }
    public void setMenuActivity(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}

