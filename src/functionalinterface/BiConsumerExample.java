package functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    static BiConsumer<String,String> bc1=(a, b)->{
        System.out.println("a = "+a+" b = "+b);
    };
    static BiConsumer<Integer,Integer> bc2=(c,b)->{
        System.out.println("Sum of a+b= "+ (c + b));
        System.out.println("Multiplication of a*b= "+ c*b);
        System.out.println("Division of a/b= "+ c/b);
        System.out.println("Remainder a%b= "+ c%b);
    };
    static BiConsumer<String,List<String>> bc3=(name,activity)->{
        System.out.println("Name= "+name  +" "+ "Activity= "+activity);
    };



    public static void printNameAndActivity(){
        List<Student> students=StudentDataBase.getAllStudents();
        students.forEach(student -> bc3.accept(student.getName(),student.getActivities()));

    }
    public static void main(String[] args) {
        bc1.accept("Aamir","Hussain");
        bc2.accept(24,5);
        printNameAndActivity();
    }
}
