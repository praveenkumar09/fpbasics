package com.udemy.java.interfaces;

public class TestInterface {
    public static void main(String[] args) {
        Alarm phone = new IPhone();
        Alarm alexa = () -> System.out.println("Alexa setting alarm");
        testSetAlarm(alexa);
        testSetAlarm(phone);
    }

    public static void testSetAlarm(Alarm alarm){
        alarm.setAlarm();
    }
}
