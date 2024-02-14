package com.example.renamelater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends AppCompatActivity {
    public String[] breeds = {"Корги", "Чихуахуа", "Терьер", "Овчарка", "Шпиц"};
    private Button ApproveAndLeave;
    private CheckBox editKastart;
    private EditText editNAME, editBD, editILLNESSES, editVES,
            veterinarDate,chumkaDate,
            gepatitDate, parovirusDate, editparagripDate,
            editandenovirusDate, editbeshenstvoDate, editleptospirozDate,
            editparaziteDate, editstrizhkaDate;
    //что делать с editBREED??????
    private Spinner editBREED;

    public SPhelper s = new SPhelper();

    public TextView breedHere;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.cust_toast_layout,
                (ViewGroup)findViewById(R.id.relativeLayout1));
        Toast toast = Toast.makeText(getApplicationContext(), "",Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();

        ApproveAndLeave = findViewById(R.id.ApproveAndLeave);
        editNAME = findViewById(R.id.editNAME);
        editBD = findViewById(R.id.editBD);
        editILLNESSES = findViewById(R.id.editILLNESSES);
        editVES = findViewById(R.id.editVES);
        veterinarDate = findViewById(R.id.veterinarDate);
        chumkaDate = findViewById(R.id.chumkaDate);
        gepatitDate = findViewById(R.id.gepatitDate);
        parovirusDate = findViewById(R.id.parovirusDate);
        editparagripDate = findViewById(R.id.editparagripDate);
        editandenovirusDate = findViewById(R.id.editandenovirusDate);
        editbeshenstvoDate = findViewById(R.id.editbeshenstvoDate);
        editleptospirozDate = findViewById(R.id.editleptospirozDate);
        editparaziteDate = findViewById(R.id.editparazitDate);
        editstrizhkaDate = findViewById(R.id.editstrizhkaDate);
        editBREED = findViewById(R.id.editBREED);
        editKastart = findViewById(R.id.editKastart);
        breedHere = findViewById(R.id.breedHere);

        //editBREED.set

        editNAME.setText(s.get(getApplicationContext(), "name"));
        editBD.setText(s.get(getApplicationContext(), "dateB"));
        editILLNESSES.setText(s.get(getApplicationContext(), "illnesses"));
        editVES.setText(s.get(getApplicationContext(), "weight"));
        veterinarDate.setText(s.get(getApplicationContext(), "veterinarDate"));
        chumkaDate.setText(s.get(getApplicationContext(), "chumkaDate"));
        gepatitDate.setText(s.get(getApplicationContext(), "gepatitDate"));
        parovirusDate.setText(s.get(getApplicationContext(), "parovirusDate"));
        editparagripDate.setText(s.get(getApplicationContext(), "paragripDate"));
        editandenovirusDate.setText(s.get(getApplicationContext(), "andenovirusDate"));
        editbeshenstvoDate.setText(s.get(getApplicationContext(), "beshenstvoDate"));
        editleptospirozDate.setText(s.get(getApplicationContext(), "leptospirozDate"));
        editparaziteDate.setText(s.get(getApplicationContext(), "parazitDate"));
        editstrizhkaDate.setText(s.get(getApplicationContext(), "strizhkaDate"));
        switch(s.get(getApplicationContext(),"kastrat")){
            case("true"):
                editKastart.setChecked(true);
                break;
            case("false"):
                editKastart.setChecked(false);
                break;
            default:
                break;
        }
        String choosenBreed = s.get(getApplicationContext(),"breed");
        breedHere.setText("Порода\nСейчас - " + choosenBreed);



        ApproveAndLeave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s.put(getApplicationContext(), "name",editNAME.getText().toString());
                s.put(getApplicationContext(), "dateB",editBD.getText().toString());
                s.put(getApplicationContext(), "illnesses", editILLNESSES.getText().toString());
                s.put(getApplicationContext(), "weight", editVES.getText().toString());
                s.put(getApplicationContext(), "veterinarDate", veterinarDate.getText().toString());
                s.put(getApplicationContext(), "chumkaDate", chumkaDate.getText().toString());
                s.put(getApplicationContext(), "gepatitDate", gepatitDate.getText().toString());
                s.put(getApplicationContext(), "parovirusDate", parovirusDate.getText().toString());
                s.put(getApplicationContext(), "paragripDate", editparagripDate.getText().toString());
                s.put(getApplicationContext(), "andenovirusDate", editandenovirusDate.getText().toString());
                s.put(getApplicationContext(), "beshenstvoDate", editbeshenstvoDate.getText().toString());
                s.put(getApplicationContext(), "leptospirozDate", editleptospirozDate.getText().toString());
                s.put(getApplicationContext(), "parazitDate", editparaziteDate.getText().toString());
                s.put(getApplicationContext(), "strizhkaDate", editstrizhkaDate.getText().toString());

                switch(editBREED.getSelectedItem().toString()){
                    case("Сменить породу"):
                        break;
                    default:
                        s.put(getApplicationContext(),"breed",editBREED.getSelectedItem().toString());
                }

                if(editKastart.isChecked()){
                    s.put(getApplicationContext(),"kastrat","true");
                }else{
                    s.put(getApplicationContext(),"kastrat","false");
                }

                setMenuActivity(view);
            }
        });

    }
    public void setMenuActivity(View view){
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }





}
