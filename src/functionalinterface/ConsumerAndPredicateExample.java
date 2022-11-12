package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateExample {

    Predicate<Student> p1=(student)-> student.getGradeLevel()>=3;

    Predicate<Student> p2=(student)->student.getGpa()>=3.9;

    BiConsumer<String, List<String>> bc1=(name, activity)-> System.out.println(name +" "+ activity);
    BiPredicate<Integer,Double> bp1=(gradeLevel, gpa)->gradeLevel>=3 && gpa>=3.9;

    Consumer<Student> c1=(student)-> {
//        if(p2.and(p1).test(student)){
//            bc1.accept(student.getName(),student.getActivities());
//    }
        if(bp1.test(student.getGradeLevel(),student.getGpa())){
            bc1.accept(student.getName(),student.getActivities());
        }

    };
    public void fiterStudent(){
        List<Student> students=StudentDataBase.getAllStudents();
        students.forEach(c1);
    }

    public static void main(String[] args) {

        new ConsumerAndPredicateExample().fiterStudent();
    }
}
