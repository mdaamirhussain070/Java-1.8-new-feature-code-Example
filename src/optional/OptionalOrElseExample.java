package optional;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {
    //orElse
    public static String optionalOrElse(){
    //    Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.getStudent.get());
        Optional<Student> optionalStudent=Optional.ofNullable(null);
        String name=optionalStudent.map(Student::getName).orElse("Default");
        return name;
    }
    //orElseGet
    public static String optionalOrElseGet(){
        Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.getStudent.get());
      //  Optional<Student> optionalStudent=Optional.ofNullable(null);
        String name=optionalStudent.map(Student::getName).orElseGet(()->"Default");
        return name;
    }
    //orElseThrow
    public static String optionalOrElseThrow(){
           Optional<Student> optionalStudent=Optional.ofNullable(StudentDataBase.getStudent.get());
    //    Optional<Student> optionalStudent=Optional.ofNullable(null);
        String name=optionalStudent.map(Student::getName).orElseThrow(()->new RuntimeException("No Data Available"));
        return name;
    }

    public static void main(String[] args) {
        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

    }
}
