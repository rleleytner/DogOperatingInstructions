package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Menu extends AppCompatActivity {
    Button goToSettings;
    SPhelper s = new SPhelper();
    ImageButton dogPage, goForAWalk, goToFeed, calendar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        dogPage = findViewById(R.id.dogPage);
        goForAWalk = findViewById(R.id.goForAWalk);
        goToFeed = findViewById(R.id.goToFeed);
        calendar = findViewById(R.id.calendar);
        goToSettings=findViewById(R.id.goToSettings);

        Drawable dog1 = getResources().getDrawable(R.drawable.photo_1dog);
        Drawable dog2 = getResources().getDrawable(R.drawable.photo_2dog);
        Drawable dog3 = getResources().getDrawable(R.drawable.photo_3dog);
        Drawable dog4 = getResources().getDrawable(R.drawable.photo_4dog);
        Drawable dog5 = getResources().getDrawable(R.drawable.photo_5dog);
        Drawable dog6 = getResources().getDrawable(R.drawable.photo_6dog);
        Drawable dogDefault = getResources().getDrawable(R.drawable.logo);


        String avatarN = s.get(getApplicationContext(),"avatar");
        switch(avatarN){
            case("1"):
                dogPage.setImageDrawable(dog1);
                break;
            case("2"):
                dogPage.setImageDrawable(dog2);
                break;
            case("3"):
                dogPage.setImageDrawable(dog3);
                break;
            case("4"):
                dogPage.setImageDrawable(dog4);
                break;
            case("5"):
                dogPage.setImageDrawable(dog5);
                break;
            case("6"):
                dogPage.setImageDrawable(dog6);
                break;
            case("default"):
                dogPage.setImageDrawable(dogDefault);
                break;
            default:
                break;
        }

        dogPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setDogsPageActivity(view);
            }
        });
        goToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setSettingsActivity(view);
            }
        });

        goForAWalk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setgoForAWalkActivity(view);
            }
        });
        goToFeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setgoToFeedActivity(view);
            }
        });
        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setCalendarActivity(view);
            }
        });
    }
    public void setCalendarActivity(View view){
        Intent intent = new Intent(this, Calendar.class);
        startActivity(intent);
    }
    public void setgoToFeedActivity(View view){
        Intent intent = new Intent(this, goToFeed.class);
        startActivity(intent);
    }
    public void setgoForAWalkActivity(View view){
        Intent intent = new Intent(this, goForAWalk.class);
        startActivity(intent);
    }
    public void setSettingsActivity(View view){
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    public void setDogsPageActivity(View view){
        Intent intent = new Intent(this, DogsPage.class);
        startActivity(intent);
    }
}