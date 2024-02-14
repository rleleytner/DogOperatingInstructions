package com.example.renamelater;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyTXTdatabase {


    public static void writeET(String filename, EditText etext, Context context){
        String myTxt=etext.getText().toString();
        try{

            FileOutputStream fout = context.openFileOutput(filename, MODE_PRIVATE);
            fout.write(myTxt.getBytes());
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }//запись в файл информации из EditText
    public static void readET(String filename,EditText editText,Context context){
        try{
            FileInputStream fin = context.openFileInput(filename);
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader buffer = new BufferedReader(reader);
            StringBuffer strbuffer = new StringBuffer();
            strbuffer.append(buffer.readLine());
            editText.setText(strbuffer);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }//вывод из файла в EditText
    }
    public static void readTV(String filename, TextView textView, Context context){
        try{
            FileInputStream fin = context.openFileInput(filename);
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader buffer = new BufferedReader(reader);
            StringBuffer strbuffer = new StringBuffer();
            strbuffer.append(buffer.readLine());
            textView.setText(strbuffer);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }//вывод из файла в TextView
    }
    public static void justSave(String filename,String strToSave, Context context){
        try{

            FileOutputStream fout = new FileOutputStream(new File(filename));
            fout.write(strToSave.getBytes());
            fout.close();
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static StringBuffer justRead(String filename, Context context){
        try{
            FileInputStream fin = new FileInputStream(new File(filename));
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader buffer = new BufferedReader(reader);
            StringBuffer strbuffer = new StringBuffer();
            strbuffer.append(buffer.readLine());
            fin.close();
            return (strbuffer);
        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new StringBuffer("null");
    }


}
