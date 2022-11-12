package streamAPImethods;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFirstExample {
    public static Optional<Student> findAny(){
        return StudentDataBase.getAllStudents().stream()
                //adam
                //jenny
                //emile
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }
    public static Optional<Student> findFirst(){
        return StudentDataBase.getAllStudents().stream()
                //adam
                //jenny
                //emile
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        if(findAny().isPresent()){
            System.out.println(findAny().get());
        }
        if(findFirst().isPresent()){
            System.out.println(findFirst().get());
        }
    }
}
