package stream;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        Map<String, List<String>> stringListMap=StudentDataBase.getAllStudents().stream()
                .peek(student -> System.out.println("========="+student))
                .filter(student -> student.getGradeLevel()>=3)
                .peek(student -> System.out.println("&&&&&&&&&"+student))
                .filter(student -> student.getGpa()>=3.9)
                .peek(student -> System.out.println("$$$$$$$$$$"+student))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(stringListMap);
    }
}
