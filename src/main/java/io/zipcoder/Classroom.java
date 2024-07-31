package io.zipcoder;

import java.util.*;

public class Classroom {

    private Student[] students;
    private int maxNumStudents;


    public Classroom(int maxNumberOfStudents){

    }

    public Classroom(Student[] students){
        this.students = students;
    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents(){
        return students;
    }

    public double getAverageExamScore (){
        double sum = 0;
        for (Student x : students){
            sum += x.getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent (Student student){
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(student);
        studentsList.toArray(students);
    }

    public void removeStudent (String firstName, String lastName){
        Student student = new Student(null,null, null);
        ArrayList<Student> studentsList = new ArrayList<>();
        for (Student x : studentsList){
            if (x.getFirstName().equals(firstName)){
                studentsList.remove(x);
            }
        }
        studentsList.toArray(students);
    }

    public Student[] getStudentsByScore(){
        List<Student> studentsAsList = new ArrayList<>(Arrays.asList(students));
        studentsAsList.sort(Student::compareTo);
        Collections.reverse(studentsAsList);
        return studentsAsList.toArray(new Student[0]);
    }
//    The class Classroom should define a method getGradeBook() which returns a mapping of
//    Student objects to a respective letter grade determined by creating a grading curve
//    such that
//    An A is awarded to students whose class average is in the upper 10th percentile.
//    A B is awarded to students whose class average falls between the upper 11th and 29th percentile.
//    A C is awarded to students whose class average falls between the upper 30th and 50th percentile.
//    A D is awarded to students whose class average falls between the lower 51st and 89th percentile.
//    An F is awarded to students whose class average is in the lower 11th percentile.

    public HashMap<Student, Character> getGradeBook(){
        HashMap<Student, Character> studentCharacterHashMap = new HashMap<>();
        Student[] listStudent = getStudentsByScore();

        for (Student student : listStudent) {
            double grade = 1 / (( maxNumStudents) * ((double) 100));

            if (grade <= 10)
                studentCharacterHashMap.put(student, 'A');
            else if (grade >= 11 && grade <= 29)
                studentCharacterHashMap.put(student, 'B');
            else if (grade >= 30 && grade <= 50)
                studentCharacterHashMap.put(student, 'C');
            else if (grade >= 51 && grade <= 89)
                studentCharacterHashMap.put(student, 'D');
            else
                studentCharacterHashMap.put(student, 'F');

        }
        return studentCharacterHashMap;
    }
}