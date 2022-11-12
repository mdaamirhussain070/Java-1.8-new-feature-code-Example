package methodrefrence;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * classsName::methodName
     */
    static Consumer<Student> studentConsumer= System.out::println;
    static Consumer<Student> studentConsumer1= Student::getActivities;

    public static void main(String[] args) {
    //    StudentDataBase.getAllStudents().forEach(studentConsumer);
        StudentDataBase.getAllStudents().forEach(studentConsumer1);
    }
}
