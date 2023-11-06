package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;




public class FirstActivityInTheWorld extends AppCompatActivity {

    Boolean ISFIRSTSTART = true;
    Button firstButtonInTheWorld;
    ImageButton dogPage, goForAWalk, goToFeed, calendar, reminder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity_in_the_world);
        firstButtonInTheWorld = findViewById(R.id.firstButtonInTheWorld);
        dogPage = findViewById(R.id.dogPage);
        goForAWalk = findViewById(R.id.goForAWalk);
        goToFeed = findViewById(R.id.goToFeed);
        calendar = findViewById(R.id.calendar);
        reminder = findViewById(R.id.reminder);
        if(ISFIRSTSTART){
            dogPage.setVisibility(View.INVISIBLE);
            goForAWalk.setVisibility(View.INVISIBLE);
            goToFeed.setVisibility(View.INVISIBLE);
            calendar.setVisibility(View.INVISIBLE);
            reminder.setVisibility(View.INVISIBLE);
            firstButtonInTheWorld.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setRegistrationActivity(view);
                }
            });
        }
        else{
            firstButtonInTheWorld.setVisibility(View.INVISIBLE);
            dogPage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    setDogsPageActivity(view);
                }
            });
        }
    }
    public void setRegistrationActivity(View view){
        Intent intent = new Intent(this, Registration.class);
        startActivity(intent);
    }
    public void setDogsPageActivity(View view){
        Intent intent = new Intent(this, DogsPage.class);
        startActivity(intent);
    }

}
