package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class REGchooseAVATAR extends AppCompatActivity {

    public RadioGroup WhichOne;
    SPhelper s = new SPhelper();
    public RadioButton avatar1, avatar2,avatar3,avatar4,avatar5,avatar6;
    public Button backToBirthD,continueToVet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regchoose_avatar);
        WhichOne = findViewById(R.id.WhichOne);
        backToBirthD = findViewById(R.id.backToBirthd);
        continueToVet=findViewById(R.id.continueToVet);



        backToBirthD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setREGenterBIRTHDActivity(view);
            }
        });
        continueToVet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(WhichOne.getCheckedRadioButtonId()){
                    case(-1):
                        Toast.makeText(getApplicationContext(),"Ничего не выбрано",Toast.LENGTH_SHORT).show();
                        break;
                    case(R.id.avatar1):
                        s.put(getApplicationContext(),"avatar","1");
                        break;
                    case(R.id.avatar2):
                        s.put(getApplicationContext(),"avatar","2");
                        break;
                    case(R.id.avatar3):
                        s.put(getApplicationContext(),"avatar","3");
                        break;
                    case(R.id.avatar4):
                        s.put(getApplicationContext(),"avatar","4");
                        break;
                    case(R.id.avatar5):
                        s.put(getApplicationContext(),"avatar","5");
                        break;
                    case(R.id.avatar6):
                        s.put(getApplicationContext(),"avatar","6");
                        break;
                    default:
                        s.put(getApplicationContext(),"avatar","default");
                        break;
                }
                if(WhichOne.getCheckedRadioButtonId()!=-1){
                    setAddVetDataActivity(view);
                }
            }
        });
    }
    public void setREGenterBIRTHDActivity(View view){
        Intent intent = new Intent(this, REGenterBIRTHD.class);
        startActivity(intent);
    }
    public void setAddVetDataActivity(View view){
        Intent intent = new Intent(this, AddVetData.class);
        startActivity(intent);
    }
}