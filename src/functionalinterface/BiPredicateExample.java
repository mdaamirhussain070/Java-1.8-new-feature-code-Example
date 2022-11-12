package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateExample {

    BiPredicate<Integer,Double> biPredicate=(grdadelevel,gpa)->grdadelevel>=3 && gpa>=3.9;
    BiConsumer<String, List<String>> biConsumer=(s,ls)-> System.out.println(s+" : "+ls);

    public void printNameAndActivity(List<Student> students){
        students.forEach(s->{
            if(biPredicate.test(s.getGradeLevel(),s.getGpa())){
                biConsumer.accept(s.getName(),s.getActivities());
            }
        });
    }

    public static void main(String[] args) {

        List<Student> studentList=StudentDataBase.getAllStudents();
        new BiPredicateExample().printNameAndActivity(studentList);
    }
}
