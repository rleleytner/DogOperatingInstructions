package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;


public class enterVetProc extends AppCompatActivity {

    SPhelper s = new SPhelper();
    Checker c = new Checker();
    EditText veterinarDate,chumkaDate,
            parovirusDate,gepatitDate,paragripDate,
            andenovirusDate,beshenstvoDate,leptospirozDate,
            parazitDate,strizhkaDate;
    CheckBox isKastrat;
    Button ApproveDataAboutVetProc, goBackToAddIllnesses;
    String VETERINARDATE,CHUMKADATE,PAROVIRUSDATE, GEPATITDATE,PARAGRIPDATE,
            ANDENOVIRUSDATE,BESHENSTVODATE,LEPTOSPIROZDATE,
            PARAZITDATE,STRIZHKADATE, ISKASTRAT;


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
        isKastrat=findViewById(R.id.isKastart);
        ApproveDataAboutVetProc = findViewById(R.id.ApproveDataAboutVetProc);
        goBackToAddIllnesses = findViewById(R.id.goBackToAddIllnesses);
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.cust_toast_layout,
                (ViewGroup)findViewById(R.id.relativeLayout1));
        Toast toast = Toast.makeText(getApplicationContext(), "",Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();
        ApproveDataAboutVetProc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                if(c.isDate(CHUMKADATE) && c.isDate(PAROVIRUSDATE)
//                        && c.isDate(PARAGRIPDATE) && c.isDate(ANDENOVIRUSDATE)
//
//                        && c.isDate(BESHENSTVODATE) && c.isDate(LEPTOSPIROZDATE)
//                        && c.isDate(PARAZITDATE) && c.isDate(STRIZHKADATE)){
                if(true){
                    if(isKastrat.isChecked()){
                        ISKASTRAT="true";
                    }else ISKASTRAT="false";
                    s.put(getApplicationContext(), "kastart",ISKASTRAT);
                    VETERINARDATE = veterinarDate.getText().toString();
                    s.put(getApplicationContext(), "veterinarDate", VETERINARDATE);
                    CHUMKADATE = chumkaDate.getText().toString();
                    s.put(getApplicationContext(), "chumkaDate", CHUMKADATE);
                    PAROVIRUSDATE = parovirusDate.getText().toString();
                    s.put(getApplicationContext(), "parovirusDate", PAROVIRUSDATE);
                    GEPATITDATE = gepatitDate.getText().toString();
                    s.put(getApplicationContext(), "gepatitDate", GEPATITDATE);
                    PARAGRIPDATE = paragripDate.getText().toString();
                    s.put(getApplicationContext(), "paragripDate", PARAGRIPDATE);
                    ANDENOVIRUSDATE = andenovirusDate.getText().toString();
                    s.put(getApplicationContext(), "andenovirusDate", ANDENOVIRUSDATE);
                    BESHENSTVODATE = beshenstvoDate.getText().toString();
                    s.put(getApplicationContext(), "beshenstvoDate", BESHENSTVODATE);
                    LEPTOSPIROZDATE = leptospirozDate.getText().toString();
                    s.put(getApplicationContext(), "leptospirozDate", LEPTOSPIROZDATE);
                    PARAZITDATE = paragripDate.getText().toString();
                    s.put(getApplicationContext(), "parazitDate", PARAZITDATE);
                    STRIZHKADATE = strizhkaDate.getText().toString();
                    s.put(getApplicationContext(), "strizhkaDate", STRIZHKADATE);
                    setlastKormLastGulActivity(view);
                }else{
                    Toast.makeText(getApplicationContext(), "Одну или несколько дат вы ввели неправильно! Попробуйте еще раз", Toast.LENGTH_LONG).show();
                }
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