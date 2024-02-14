package com.example.renamelater;

import android.content.Context;
import android.content.SharedPreferences;

public class SPhelper {
    public static final String STORAGE_NAME = "STORAGE";

    public void put(Context context, String key, String strToSave){
        SharedPreferences data = context.getSharedPreferences(STORAGE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = data.edit();
        editor.putString(key,strToSave);
        editor.apply();
    }
    public String get(Context context, String key){
        SharedPreferences data = context.getSharedPreferences(STORAGE_NAME, Context.MODE_PRIVATE);
        if(data.contains(key)){
            return data.getString(key,"nothing");
        }
        return "NO_SUCH_KEYS";
    }
}
