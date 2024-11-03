package com.udemy.java.interfaces;

public class TestInterface {
    public static void main(String[] args) {
        Alarm phone = new IPhone();
    }

    public static void testSetAlarm(Alarm alarm){
        alarm.setAlarm();
    }
}
