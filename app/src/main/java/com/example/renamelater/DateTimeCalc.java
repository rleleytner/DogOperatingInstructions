package com.example.renamelater;

import android.util.Pair;

public class DateTimeCalc {
    public Pair<Integer,Integer> getHoursMinutes(String time){
        String hours = time.substring(0,time.indexOf(':'));
        String minutes = time.substring(time.indexOf(':')+1);
        Pair res = new Pair(Integer.valueOf(hours),Integer.valueOf(minutes));
        return res;
    }

    public String plusTime(String curTime, String plTime){
        Pair<Integer,Integer> cur = getHoursMinutes(curTime);
        Pair<Integer,Integer> pl = getHoursMinutes(plTime);
        Pair<Integer,Integer> res = new Pair((cur.first+pl.first)%24,(cur.second+pl.second)%60);
        String sum = res.first.toString() + ":" + res.second.toString();
        return sum;
    }
}
