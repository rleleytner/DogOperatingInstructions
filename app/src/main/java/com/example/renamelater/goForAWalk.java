package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class goForAWalk extends AppCompatActivity {

    Button walkDone, editWalkTime, goBackToMenu;
    LinearLayout morningTime, eveningTime;
    SPhelper s = new SPhelper();
    Date currentDate = new Date();
    DateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
    TextView TimeOfLastGul;
    EditText editMorningTime, editEveningTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_for_awalk);
        walkDone = findViewById(R.id.walkDone);
        TimeOfLastGul = findViewById(R.id.TimeOfLastGul);
        editWalkTime = findViewById(R.id.editWalkTime);
        morningTime = findViewById(R.id.morningTime);
        eveningTime = findViewById(R.id.eveningTime);
        editMorningTime = findViewById(R.id.editMorningTime);
        editEveningTime = findViewById(R.id.editEveningTime);
        morningTime.setVisibility(View.INVISIBLE);
        eveningTime.setVisibility(View.INVISIBLE);
        goBackToMenu = findViewById(R.id.goBackToMenu);
        editMorningTime.setText(s.get(getApplicationContext(),"morning_gul"));
        editEveningTime.setText(s.get(getApplicationContext(),"evening_gul"));
        String lastwalkTime = s.get(getApplicationContext(),"lastwalktime");
        TimeOfLastGul.setText("Время последнего выгула:\n" + lastwalkTime);
        walkDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String timeText = timeFormat.format(currentDate);
                s.put(getApplicationContext(),"lastwalktime",timeText);
                TimeOfLastGul.setText("Время последнего выгула:\n" + timeText);
            }
        });
        editWalkTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editWalkTime.getText().toString()=="Изменить время выгула"){
                    morningTime.setVisibility(View.VISIBLE);
                    eveningTime.setVisibility(View.VISIBLE);
                    editMorningTime.setText(s.get(getApplicationContext(),"morning_gul"));
                    editEveningTime.setText(s.get(getApplicationContext(),"evening_gul"));
                    editWalkTime.setText("Сохранить");
                }
                else{
                    editWalkTime.setText("Изменить время выгула");
                    s.put(getApplicationContext(),"morning_gul",editMorningTime.getText().toString());
                    s.put(getApplicationContext(),"evening_gul",editEveningTime.getText().toString());
                    morningTime.setVisibility(View.INVISIBLE);
                    eveningTime.setVisibility(View.INVISIBLE);
                }
            }
        });
        goBackToMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setMenuActivity(view);
            }
        });
    }
    public void setMenuActivity(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}