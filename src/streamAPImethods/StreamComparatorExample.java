package streamAPImethods;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static List<Student> getAllStudentInSorted(){
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        getAllStudentInSorted().forEach(student -> System.out.println(student));
    }
}
