package com.OOPS.Comparable;

public class Student implements Comparable<Student> {
    private  int studentId;
    private String studentName;
    private int marks;

    public Student(int studentId, String studentName, int marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) {
        return this.getStudentId()-o.getStudentId();
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                '}';
    }


}
