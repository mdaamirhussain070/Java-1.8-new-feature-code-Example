package stream_terminal;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsJoiningExample {
    public static String join_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }
    public static String join_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-"));
    }
    public static String join_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("-","(",")"));
    }

    public static void main(String[] args) {
        System.out.println(join_1());
        System.out.println(join_2());
        System.out.println(join_3());

    }
}
