package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> predicate=(p)-> p.getGradeLevel()>=3;
    Predicate<Student> predicate2=(p)-> p.getGpa()>=3.9;
    BiConsumer<String ,List<String>> biConsumer=(name,activities)-> System.out.println(name+" : "+activities);
    Consumer<Student> studentConsumer=(s)->{
        if(predicate.and(predicate2).test(s)){
            biConsumer.accept(s.getName(),s.getActivities());
        }
    };
    public void printNameandActivities(List<Student> students){
       students.forEach(s->biConsumer.accept(s.getName(),s.getActivities()));
    }

    public static void main(String[] args) {
        List<Student> students=StudentDataBase.getAllStudents();

        new PredicateAndConsumerExample().printNameandActivities(students);

    }
}
