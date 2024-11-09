package com.udemy.java.streams;

public class Person {
    private String name;
    private String gender;
    private String country;
    private boolean selected;


    public Person(String name, String gender, String country, boolean selected) {
        this.name = name;
        this.gender = gender;
        this.country = country;
        this.selected  =selected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                ", selected=" + selected +
                '}';
    }
}
