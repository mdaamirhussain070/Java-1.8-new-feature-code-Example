package stream;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMethodExample {

    public static List<String> studentActivityList(){
        List<String> activityList= StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .peek(s -> System.out.println(s))
                .flatMap(List::stream)
                .collect(Collectors.toList());
        return activityList;
    }
    public static Set<String> studentActivitySet(){
        Set<String> activitySet= StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .peek(s -> System.out.println(s))
                .flatMap(List::stream)
                .collect(Collectors.toSet());
        return activitySet;
    }
    public static void main(String[] args) {
        System.out.println(studentActivityList());
        System.out.println(studentActivitySet());
    }
}
