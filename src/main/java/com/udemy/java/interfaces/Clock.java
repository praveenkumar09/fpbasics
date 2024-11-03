package com.udemy.java.interfaces;

import java.time.LocalDateTime;
import java.util.Date;

public class Clock implements Alarm {
    public void showTime(){
        System.out.println("Current time: " + LocalDateTime.now());
    }
    public void setAlarm(){
        System.out.println("Alarm is set for 9:00 AM");
    }
}
