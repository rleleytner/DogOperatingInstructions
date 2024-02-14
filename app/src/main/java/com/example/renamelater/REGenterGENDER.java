package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class REGenterGENDER extends AppCompatActivity {
    private RadioGroup MaleOrFemale;
    private RadioButton kobel, suka;
    private Button backToBreed, continueToBirthd;
    private SPhelper s = new SPhelper();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regenter_gender);
        MaleOrFemale = findViewById(R.id.MaleOrFemale);
        backToBreed = findViewById(R.id.backToBreed);
        continueToBirthd = findViewById(R.id.continueToBirthd);
        kobel = findViewById(R.id.kobel);
        suka = findViewById(R.id.suka);

        backToBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setREGenterBREEDActivity(view);
            }
        });

        continueToBirthd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(MaleOrFemale.getCheckedRadioButtonId()) {
                    case (-1):
                        Toast.makeText(getApplicationContext(),"Ничего не выбрано",Toast.LENGTH_SHORT).show();
                        break;
                    case (R.id.kobel):
                        s.put(getApplicationContext(), "gender", "male");
                        break;
                    case (R.id.suka):
                        s.put(getApplicationContext(), "gender", "female");
                    default:
                        break;
                }
                if(MaleOrFemale.getCheckedRadioButtonId()!=-1){
                    setREGenterBIRTHDActivity(view);
                }
            }
        });
    }

    public void setREGenterBREEDActivity(View view){
        Intent intent = new Intent(this, REGenterBREED.class);
        startActivity(intent);
    }
    public void setREGenterBIRTHDActivity(View view){
        Intent intent = new Intent(this, REGenterBIRTHD.class);
        startActivity(intent);
    }
}