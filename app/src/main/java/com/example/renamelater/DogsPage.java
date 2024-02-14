package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class DogsPage extends AppCompatActivity {

    ImageView AvatarDP;
    TextView nameP, dateOfBirthP, illnessesP,
            DPGender, DPVES, DPBREED, DPveterinarDate,
            DPchumkaDate, DPparovirusDate, DPgepatitDate,
            DPparagripDate, DPandenovirusDate, DPbeshenstvoDate,
            DPleptospirozDate, DPparazitDate, DPstrizhkaDate;
    Button goToMenu;
    SPhelper s = new SPhelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogs_page);
        Context cxt = getApplicationContext();
        nameP = findViewById(R.id.nameP);
        dateOfBirthP = findViewById(R.id.dateOfBirthP);
        illnessesP = findViewById(R.id.illnessesP);
        DPGender = findViewById(R.id.DPGender);
        DPVES = findViewById(R.id.DPVES);
        DPBREED = findViewById(R.id.DPBREED);
        DPveterinarDate = findViewById(R.id.DPveterinarDate);
        DPchumkaDate = findViewById(R.id.DPchumkaDate);
        DPparovirusDate = findViewById(R.id.DPparovirusDate);
        DPgepatitDate = findViewById(R.id.DPgepatitDate);
        DPparagripDate = findViewById(R.id.DPparagripDate);
        DPandenovirusDate = findViewById(R.id.DPandenovirusDate);
        DPbeshenstvoDate = findViewById(R.id.DPbeshenstvoDate);
        DPleptospirozDate = findViewById(R.id.DPleptospirozDate);
        DPparazitDate = findViewById(R.id.DPparazitDate);
        DPstrizhkaDate = findViewById(R.id.DPstrizhkaDate);
        AvatarDP = findViewById(R.id.AvatarDP);
        goToMenu = findViewById(R.id.goToMenu);

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
                AvatarDP.setImageDrawable(dog1);
                break;
            case("2"):
                AvatarDP.setImageDrawable(dog2);
                break;
            case("3"):
                AvatarDP.setImageDrawable(dog3);
                break;
            case("4"):
                AvatarDP.setImageDrawable(dog4);
                break;
            case("5"):
                AvatarDP.setImageDrawable(dog5);
                break;
            case("6"):
                AvatarDP.setImageDrawable(dog6);
                break;
            case("default"):
                AvatarDP.setImageDrawable(dogDefault);
                break;
            default:
                break;
        }

        nameP.setText(s.get(cxt, "name"));
        dateOfBirthP.setText(s.get(cxt, "dateB"));
        String strIllns;
        strIllns = "Болезни:\n" + s.get(cxt,"illnesses") + "\n";
        switch(s.get(getApplicationContext(),"kastrat")){
            case("true"):
                strIllns = strIllns + "Кастрирован";
                break;
            case("false"):
                strIllns = strIllns + "Не кастрирован";
                break;
            default:
                break;
        }
        illnessesP.setText(strIllns);
        switch (s.get(cxt,"gender")){
            case("male"):
                DPGender.setText("Кобель");
                break;
            case("female"):
                DPGender.setText("сука");
                break;
            default:
                break;
        }
        DPVES.setText(s.get(cxt,"weight"));
        DPBREED.setText(s.get(cxt,"breed"));
        DPveterinarDate.setText(s.get(cxt,"veterinarDate"));
        DPchumkaDate.setText(s.get(cxt,"chumkaDate"));
        DPparovirusDate.setText(s.get(cxt,"parovirusDate"));
        DPgepatitDate.setText(s.get(cxt,"gepatitDate"));
        DPparagripDate.setText(s.get(cxt,"paragripDate"));
        DPandenovirusDate.setText(s.get(cxt,"andenovirusDate"));
        DPbeshenstvoDate.setText(s.get(cxt,"beshenstvoDate"));
        DPleptospirozDate.setText(s.get(cxt,"leptospirozDate"));
        DPparazitDate.setText(s.get(cxt,"parazitDate"));
        DPstrizhkaDate.setText(s.get(cxt,"strizhkaDate"));

        goToMenu.setOnClickListener(new View.OnClickListener() {
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