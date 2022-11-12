package functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionStudentExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> BiFunction=
            ((student, studentPredicate) -> {
                Map<String,Double> StudentGradeMap=new HashMap<>();
                student.forEach(student1 -> {
                    if(studentPredicate.test(student1)){
                        StudentGradeMap.put(student1.getName(),student1.getGpa());
                    }
                });
                return StudentGradeMap;
        });
    public static void main(String[] args) {
        System.out.println(BiFunction.apply(StudentDataBase.getAllStudents(),PredecateStudentExample.p2));

    }
}
