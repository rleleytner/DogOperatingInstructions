package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.javafaker.Bool;

public class MainActivity extends AppCompatActivity {
    Button enterApp;
    SPhelper s = new SPhelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterApp=findViewById(R.id.enterApp);
        enterApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //кто куда а я в ...
                setMenuActivity(view);
            }
        });
    }
    public void setFirstActivity(View view){
        Intent intent = new Intent(this, FirstActivityInTheWorld.class);
        startActivity(intent);
    }
    public void setMenuActivity(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }

}