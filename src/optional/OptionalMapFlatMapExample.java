package optional;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
   // filter
    public static void filter(){
        Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.getStudent.get());
        optionalStudent
                .filter(student -> student.getGpa()>=3.5)
                .ifPresent(student -> System.out.println(student));
    }

    //map
    public static void optionalMap(){
        Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.getStudent.get());
        if(optionalStudent.isPresent()){
            Optional<String> optionalString=optionalStudent
                    .filter(student -> student.getGpa()>=3.5)
                    .map(Student::getName);
            System.out.println(optionalString);
        }
    }
    public static void optionalFlatMap(){
        Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.getStudent.get());
        Optional<String> name=optionalStudent
                .filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBicke)           //Optional bike
                .map(Bicke::getBikeName);

        if(name.isPresent()){
            System.out.println(name.get());
        }
    }
    public static void main(String[] args) {
        filter();
        optionalMap();
        optionalFlatMap();
    }
}
