package stream;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class TreamMapMetodExample {
    public static List<String> studentNameList() {
        List<String> studentName = StudentDataBase.getAllStudents().stream()
                //Student is an input->oputput stream of String
                .map(Student::getName)//converting student to string
                .map(String::toUpperCase) //perfor operation on string stream
                .collect(Collectors.toList());
        return studentName;
    }
    public static Set<String> studentNameSet() {
        Set<String> studentNameSet = StudentDataBase.getAllStudents().stream()
                //Student is an input->oputput stream of String
                .peek(student -> System.out.println(student))
                .map(Student::getName)//converting student to string
                .peek(student -> System.out.println(student))
                .map(String::toLowerCase) //perfor operation on string stream
                .peek(student -> System.out.println(student))
                .collect(toSet());
        return studentNameSet;
    }
    public static void main(String[] args) {
        System.out.println(studentNameList());
        System.out.println(studentNameSet());
    }
}
