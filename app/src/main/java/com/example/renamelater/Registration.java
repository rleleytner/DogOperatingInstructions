package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;



public class Registration extends AppCompatActivity {

    private Button enterName, enterBreed, enterBD, enterGender, loadDocs, loadPhoto, endRegistartion;
    private ProgressBar progressBarReg;
    private FrameLayout fragmentsReg;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        progressBarReg = findViewById(R.id.progressBarReg);
        progressBarReg.setVisibility(ProgressBar.VISIBLE);
        progressBarReg.setProgress(0);
        //progressBarReg.setVisibility(ProgressBar.INVISIBLE);

        enterName=findViewById(R.id.enterName);//1 btn
        enterBreed=findViewById(R.id.enterBreed);//2 btn
        enterGender=findViewById(R.id.enterGender);//3 btn
        enterBD=findViewById(R.id.enterBD);//4 btn
        loadDocs=findViewById(R.id.loadDocs);//5 btn
        loadPhoto=findViewById(R.id.loadPhoto);//6 btn
        fragmentsReg=findViewById(R.id.fragmentsReg);
        endRegistartion=findViewById(R.id.endRegistration);//заверщить btn

        enterNAME enterNAME = new enterNAME();//fragment enter name
        enterBREED enterBREED = new enterBREED();// fragment enter breed
        enterBIRTHD enterBIRTHD = new enterBIRTHD();// fragment enter birth day
        enterGENDER enterGENDER = new enterGENDER();// fragment enter gender
        loadDOCS loadDOCS = new loadDOCS();//fragment load docs
        loadPHOTO loadPHOTO = new loadPHOTO();// fragment load photo

        enterName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarReg.setProgress(0);
                progressBarReg.setProgress(16);
                setNewFragment(enterNAME);
            }
        });//вызывает поле для ввода имени
        enterBreed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarReg.setProgress(0);
                progressBarReg.setProgress(33);
                setNewFragment(enterBREED);
            }
        });//вызывает поля для выбора породы
        enterGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarReg.setProgress(0);
                progressBarReg.setProgress(50);
                setNewFragment(enterGENDER);
            }
        });//вызывает поле для выбора пола
        enterBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarReg.setProgress(0);
                progressBarReg.setProgress(66);
                setNewFragment(enterBIRTHD);
            }
        });//вызывает поле для ввода дня месяца и года рождения
        loadDocs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarReg.setProgress(0);
                progressBarReg.setProgress(83);
                setNewFragment(loadDOCS);
            }
        });
        loadPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBarReg.setProgress(0);
                progressBarReg.setProgress(100);
                setNewFragment(loadPHOTO);
            }
        });
        endRegistartion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setAddVetDataActivity(view);
            }
        });// to addVetData activity

    }

    public void setAddVetDataActivity(View view){
        Intent intent = new Intent(this, AddVetData.class);
        startActivity(intent);
    }
    private void setNewFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragmentsReg, fragment);
        ft.commit();
    }//универсальная функция смены фрагмента в активити, дабы не копировать код по сто раз
}