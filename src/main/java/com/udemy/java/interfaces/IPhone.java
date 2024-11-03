package com.udemy.java.interfaces;

public class IPhone implements Alarm {
    public void dial(){
        System.out.println("Calling 1 2 3 ...");
    }
    public void answer(){
        System.out.println("Hellloooo.....");
    }
    public void setAlarm(){
        System.out.println("Alarm is set for 8:00 PM");
    }
}
