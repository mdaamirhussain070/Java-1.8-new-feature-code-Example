package functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String,Double>> sf1=(students ->{
        Map<String,Double> studentGrade=new HashMap<>();
        students.forEach(student -> {
           if(PredecateStudentExample.p1.test(student))
            studentGrade.put(student.getName(),student.getGpa());
        });
        return studentGrade;
    });


    public static void main(String[] args) {

        System.out.println(sf1.apply(StudentDataBase.getAllStudents()));
    }
}
