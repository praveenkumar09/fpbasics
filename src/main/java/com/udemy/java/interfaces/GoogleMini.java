package com.udemy.java.interfaces;

public class GoogleMini implements Alarm {
    public void ask(){
        System.out.println("How is the weather outside?...");
    }
    public void setAlarm(){
        System.out.println("Alarm is set for 7:00 AM");
    }
}
