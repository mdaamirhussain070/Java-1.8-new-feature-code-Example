package streamAPImethods;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static List<String> nameList(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(nameList());
    }
}
