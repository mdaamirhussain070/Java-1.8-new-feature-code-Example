package functionalinterface;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredecateStudentExample {

   static Predicate<Student> p1=(s)-> s.getGradeLevel()>3.0;
    static Predicate<Student> p2=(s)-> s.getGpa()>=3.9;



    public static void fiterStudentBygrade(){
        List<Student> students=StudentDataBase.getAllStudents();
        students.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student.getName() +" "+student.getGradeLevel()+" "+ student.activities);
            }
                })

        );

    }
    public static void main(String[] args) {
        fiterStudentBygrade();
    }
}
