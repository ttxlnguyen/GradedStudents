package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {

    @Test
    public void setFirstNameTest() {
        Double [] testScores = {7.5, 6.7, 7.4};
        Student student = new Student("Joshua","Smith",testScores);
        student.setFirstName("Josh");
        String actual = student.getFirstName();
        String expected = "Josh";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void setLastNameTest() {
        Double [] testScores = {7.5, 6.7, 7.4};
        Student student = new Student("Joshua","Smith",testScores);
        student.setLastName("Johny");
        String actual = student.getLastName();
        String expected = "Johny";
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void getExamScoresTest() {
        Double [] testScores = {7.5, 6.7, 7.4};
        Student student = new Student("Joshua","Smith",testScores);
        List<Double> actual = student.getExamScores();
        List<Double> expected = new ArrayList<>(Arrays.asList(7.5, 6.7, 7.4));
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void getNumbersOfExamsTaken() {

    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void setExamScore() {
    }

    @Test
    public void getAverageExamScore() {
    }

    @Test
    public void testToString() {
    }

    @Test
    public void compareTo() {
    }
}