package com.example.renamelater;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;




public class enterNAME extends Fragment {
    String NAME="";
    private Button approveName;
    private EditText nameOfDog;
    @Override
    public void onCreate(Bundle SavedInstanceState) {
        super.onCreate(SavedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_enter_n_a_m_e, container, false);
        approveName = (Button)inflatedView.findViewById(R.id.approveName);
        nameOfDog = (EditText)inflatedView.findViewById(R.id.nameOfDog);
        approveName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NAME=nameOfDog.getText().toString();
            }
        });
        return inflater.inflate(R.layout.fragment_enter_n_a_m_e,container,false);
    }

}