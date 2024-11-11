package com.udemy.java.streams;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private int score;
    private int height;

    public Student(String firstName, String lastName, int score, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
        this.height = height;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    @Override
    public int compareTo(Student o) {
        int firstNameComparison = this.firstName.compareTo(o.firstName);
        return (firstNameComparison != 0) ? firstNameComparison : this.lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", score=" + score +
                ", height=" + height +
                '}';
    }
}
