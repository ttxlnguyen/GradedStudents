package io.zipcoder;

import java.util.ArrayList;

public class Student {

    private String firstname;
    private String lastname;
    private ArrayList<Double> examScores;
    private int numberOfExamsTaken;

    public Student (String firstname, String lastname, Double[] examScores){

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public int getNumberOfExamsTaken() {
        return numberOfExamsTaken;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScores(int exam, double score) {
        examScores.set(exam, score);
    }

    public double getAverageExamScore() {
        double sum = 0;
        for (double i : examScores) {
            sum += i;
        }
        return sum / examScores.size();
    }

    public String toString() {
        return ("Student Name: " + firstname + lastname + "\n> Average Score: " + getAverageExamScore() +"\n> Exam Scores:\n\t" + examScores);
    }

}
