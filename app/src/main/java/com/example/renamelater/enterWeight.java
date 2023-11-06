package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class enterWeight extends AppCompatActivity {

    private EditText weightOfDog;
    private Button nextVet;
    String WEIGHT = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_weight);
        weightOfDog = findViewById(R.id.weightOfDog);
        nextVet = findViewById(R.id.nextVet);
        nextVet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WEIGHT = weightOfDog.getText().toString();
                setAddIllnessesActivity(view);
                /*if(WEIGHT != null){
                    setAddIllnessesActivity(view);
                }
                else{
                    makeToast("Вы не ввели вес(((");
                }*/
            }
        });
    }
    public void makeToast(String text){
        Toast.makeText(this,text,Toast.LENGTH_LONG);
    }
    public void setAddIllnessesActivity(View view) {
        Intent intent = new Intent(this, addIllnesses.class);
        startActivity(intent);
    }
}