package functionalinterface;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2=(student)-> System.out.println(student);
    static Consumer<Student> c3=(student)-> System.out.print(student.getName());
    static Consumer<Student> c4=(student)-> System.out.println(student.activities);
    static List<Student> studentsList=StudentDataBase.getAllStudents();
    public static void printNames(){
        System.out.println("Printing all Student");
        studentsList.forEach(c2);
    }

    public static void printNameAndActivity(){
        System.out.println("printing by name and Activity");
        studentsList.forEach(c3.andThen(c4));
    }

    public static void prrintNameByFilteringGrade(){
        System.out.println("Print by filter");
        studentsList.forEach(student -> {
            if(student.getGradeLevel()>=4){
                c3.andThen(c4).accept(student);
            }
        });
    }
    public static void main(String[] args) {

        Consumer<String> c1=(s)-> System.out.println(s.toUpperCase());


        c1.accept("Java8");
        printNames();
        printNameAndActivity();
        prrintNameByFilteringGrade();
    }

}
