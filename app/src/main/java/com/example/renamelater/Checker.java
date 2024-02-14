package com.example.renamelater;

public class Checker {
// дд.мм.гггг
// 00:00 0:12
    public boolean isDate(String str){
        if(str.indexOf('.')==2 && str.lastIndexOf('.')==5){
            String day = str.substring(0,2);
            String month = str.substring(3,5);
            if(1<=Integer.valueOf(day) && Integer.valueOf(day)<=31
                && 1<=Integer.valueOf(month) && Integer.valueOf(month)<=12){
                return true;
            }
        }
        return false;
    }
    public boolean isTime(String str){
        String hour,minute;
        if(str.length()>5){
            return false;
        }
        switch(str.indexOf(':')) {
            case (2):
                hour = str.substring(0, 2);
                minute = str.substring(3, 5);
                if (0 <= Integer.valueOf(hour) && Integer.valueOf(hour) <= 23
                        && 0 <= Integer.valueOf(minute) && Integer.valueOf(minute) <= 59) {
                    return true;
                }
                return false;
            case (1):
                hour = str.substring(0, 1);
                minute = str.substring(2, 4);
                if (0 <= Integer.valueOf(hour) && Integer.valueOf(hour) <= 9
                        && 0 <= Integer.valueOf(minute) && Integer.valueOf(minute) <= 59) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
