package stream_terminal;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.List;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

public class StreamsMappingExample {


    public static void main(String[] args) {
       List<String> students=StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName,toList()));
        System.out.println(students);
    }
}
