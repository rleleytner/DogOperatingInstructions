package com.example.renamelater;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;



public class enterBIRTHD extends Fragment {

    private CalendarView calendarForBD;
    private TextView dateB;
    private Button APPROVE;
    String DATE="";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View inflatedView = inflater.inflate(R.layout.fragment_enter_b_i_r_t_h_d, container, false);
        calendarForBD = (CalendarView) inflatedView.findViewById(R.id.calendarForBD);
        dateB = (TextView) inflatedView.findViewById(R.id.dateB);
        APPROVE = (Button) inflatedView.findViewById(R.id.APPROVE);
        APPROVE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dateB.setText((int) calendarForBD.getDate());
            }
        });
        //dateB.setText("Date is : " + dayOfMonth +" / " + (month+1) + " / " + year);

        return inflater.inflate(R.layout.fragment_enter_b_i_r_t_h_d, container, false);
    }

}