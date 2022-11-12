package optional;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static Optional<String> getStudentNameOptional(){
      //  Optional<Student> studentOptional=Optional.ofNullable(StudentDataBase.getStudent.get());
        Optional<Student> studentOptional=Optional.ofNullable(null);
        if(studentOptional.isPresent()){
            return studentOptional.map(Student::getName);// optional string
        }
        return Optional.empty(); // represent optional object with no value
    }
    public static void main(String[] args) {
        Optional<String> optionalName=getStudentNameOptional();
        if(optionalName.isPresent()){
            System.out.println(optionalName.get().length());
        }else {
            System.out.println("Name not found");
        }
    }
}
