package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;



public class enterVetProc extends AppCompatActivity {

    EditText veterinarDate,chumkaDate,
            parovirusDate,gepatitDate,paragripDate,
            andenovirusDate,beshenstvoDate,leptospirozDate,
            parazitDate,strizhkaDate;
    Switch isKastrat;
    Button ApproveDataAboutVetProc, goBackToAddIllnesses;
    String VETERINARDATE,CHUMKADATE,PAROVIRUSDATE,PARAGRIPDATE,
            ANDENOVIRUSDATE,BESHENSTVODATE,LEPTOSPIROZDATE,
            PARAZITDATE,STRIZHKADATE;
    boolean ISKASTRAT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_vet_proc);
        veterinarDate=findViewById(R.id.veterinarDate);
        chumkaDate=findViewById(R.id.chumkaDate);
        parovirusDate=findViewById(R.id.parovirusDate);
        gepatitDate=findViewById(R.id.gepatitDate);
        paragripDate=findViewById(R.id.paragripDate);
        andenovirusDate=findViewById(R.id.andenovirusDate);
        beshenstvoDate=findViewById(R.id.beshenstvoDate);
        leptospirozDate=findViewById(R.id.leptospirozDate);
        parazitDate=findViewById(R.id.parazitDate);
        strizhkaDate=findViewById(R.id.strizhkaDate);
        isKastrat=findViewById(R.id.isKastrat);
        ApproveDataAboutVetProc = findViewById(R.id.ApproveDataAboutVetProc);
        goBackToAddIllnesses = findViewById(R.id.goBackToAddIllnesses);

        isKastrat.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                if(isKastrat.getText().toString() == "             Да"){
                    isKastrat.setBackgroundColor(R.color.GreenApple);
                }
            }
        });
        ApproveDataAboutVetProc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isKastrat.getText().toString()=="             Да"){
                    ISKASTRAT=true;
                }else ISKASTRAT=false;
                VETERINARDATE = veterinarDate.getText().toString();
                CHUMKADATE = chumkaDate.getText().toString();
                PAROVIRUSDATE = parovirusDate.getText().toString();
                PARAGRIPDATE = paragripDate.getText().toString();
                ANDENOVIRUSDATE = andenovirusDate.getText().toString();
                BESHENSTVODATE = beshenstvoDate.getText().toString();
                LEPTOSPIROZDATE = leptospirozDate.getText().toString();
                PARAZITDATE = paragripDate.getText().toString();
                STRIZHKADATE = strizhkaDate.getText().toString();
                setlastKormLastGulActivity(view);
            }
        });
        goBackToAddIllnesses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setaddIllnessesActivity(view);
            }
        });
    }
    public void setlastKormLastGulActivity(View view){
        Intent intent = new Intent(this, lastKormLastGul.class);
        startActivity(intent);
    }
    public void setaddIllnessesActivity(View view){
        Intent intent = new Intent(this, addIllnesses.class);
        startActivity(intent);
    }
}