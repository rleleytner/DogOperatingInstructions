package com.example.renamelater;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;




public class enterGENDER extends Fragment {

    private RadioGroup MaleOrFemale;
    Boolean gender;//0-male,1-female
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_enter_g_e_n_d_e_r, container, false);
        MaleOrFemale=(RadioGroup) inflatedView.findViewById(R.id.MaleOrFemale);
        MaleOrFemale.clearCheck();
        MaleOrFemale.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.kobel:
                        gender=false;
                        break;
                    case R.id.suka:
                        gender=true;
                        break;
                }
            }
        });
        return inflater.inflate(R.layout.fragment_enter_g_e_n_d_e_r, container, false);
    }
}