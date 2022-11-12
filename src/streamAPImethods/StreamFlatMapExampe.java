package streamAPImethods;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFlatMapExampe {
    public static Set<String> printListOfActivities(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }

    public static List<String> printListUsingDifferentStreamMethod(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
    public static Long getStudentActivitiesCount(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count()
                ;
    }
    public static void main(String[] args) {
        System.out.println(printListOfActivities());
        System.out.println("----------------------------------------------");
        System.out.println(printListUsingDifferentStreamMethod());
        System.out.println(getStudentActivitiesCount());
    }
}
