package com.example.renamelater;

import static android.app.Activity.RESULT_OK;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;



public class loadDOCS extends Fragment {

    private final int GALLERY_REQ_CODE = 1000;
    private ImageView img;
    private Button btn_img;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View inflatedView = inflater.inflate(R.layout.fragment_load_d_o_c_s, container, false);


        return inflater.inflate(R.layout.fragment_load_d_o_c_s, container, false);
    }

}