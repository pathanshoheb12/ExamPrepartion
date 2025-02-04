package com.OOPS.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListOfStudents {
    public static void main(String[] args) {
        List<Student>listOfStudent = new ArrayList<Student>();

        Student student1 = new Student(2,"Alice",98);
        Student student2 = new Student(1,"Bob",70);
        Student student3 = new Student(4,"John",65);
        Student student4 = new Student(3,"Miller",89);
        Student student5 = new Student(5,"Raaj",99);

        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        listOfStudent.add(student5);

        Collections.sort(listOfStudent);
        System.out.println("List of Students Sorting on the basis of Id");
       for(Student student:listOfStudent)
       {
           System.out.println(student);
       }



    }
}
