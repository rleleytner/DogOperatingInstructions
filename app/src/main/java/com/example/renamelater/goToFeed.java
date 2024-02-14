package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class goToFeed extends AppCompatActivity {

    // Идентификатор уведомления
    private static final int NOTIFY_ID = 101;

    // Идентификатор канала
    private static String CHANNEL_ID = "Cat channel";


    Button feedDone, goBackToMenuFeed;
    TextView TimeOfLastFeed;
    Date currentDateF = new Date();
    DateFormat timeFormatF = new SimpleDateFormat("HH:mm", Locale.getDefault());
    SPhelper s = new SPhelper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_feed);
        feedDone = findViewById(R.id.feedDone);
        goBackToMenuFeed = findViewById(R.id.goBackToMenuFeed);
        TimeOfLastFeed = findViewById(R.id.TimeOfLastFeed);
        String lastfeedTime = s.get(getApplicationContext(),"lastfeedtime");
        TimeOfLastFeed.setText("Время последнего кормления:\n" + lastfeedTime);

        feedDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String timeText = timeFormatF.format(currentDateF);
                s.put(getApplicationContext(),"lastfeedtime",timeText);
                TimeOfLastFeed.setText("Время последнего кормления:\n" + timeText);

            }
        });

        goBackToMenuFeed.setOnClickListener(new View.OnClickListener() {
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