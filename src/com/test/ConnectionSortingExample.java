package com.test;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class ConnectionSortingExample {

    public static List<Student> sortingByName(){
       List<Student> studentSorted= StudentDataBase.getAllStudents().stream()

               .sorted(Comparator.comparing(Student::getName))
                .collect(toList());
       return studentSorted;
    }
    public static List<Student> sortingByGpa(){
        List<Student> studentSorted= StudentDataBase.getAllStudents().stream()

                .sorted(Comparator.comparing(Student::getGpa))
                .collect(toList());
        return studentSorted;
    }
    public static List<Student> sortingByGpaInDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(toList());
    }

    public static void main(String[] args) {
        System.out.println("Sorting according to name");
        System.out.println(sortingByName());
        System.out.println("Sorting according to gpa");
        System.out.println(sortingByGpa());
        System.out.println("Sorting by Gpa in Descending order");
        System.out.println(sortingByGpaInDesc());
    }
}
