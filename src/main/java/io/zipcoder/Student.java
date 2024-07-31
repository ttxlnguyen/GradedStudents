package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student> {
    private String firstname;
    private String lastname;
    private ArrayList<Double> examScores;
    private int numberOfExamsTaken;

    public Student() {
        this.examScores = new ArrayList<>();
    }

    public Student (String firstname, String lastname, Double[] testScores){
        this.firstname = firstname;
        this.lastname = lastname;
        this.examScores = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
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

    @Override
    public int compareTo(Student otherStudent) {
        int averageScore;
        if (this.getAverageExamScore() < otherStudent.getAverageExamScore()){
            averageScore = (int)otherStudent.getAverageExamScore();
        } else {
            averageScore = (int)this.getAverageExamScore();
        }
        return averageScore;
    }
}
