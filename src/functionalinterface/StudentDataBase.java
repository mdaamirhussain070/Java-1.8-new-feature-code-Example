package functionalinterface;

import optional.Bicke;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

    /**
     * Total of 6 students in the database.
     * @return
     */
    public static  Supplier<Student> getStudent=()->{
        Bicke bicke=new Bicke();
        bicke.setBikeName("ABC");
        bicke.setModel("123ZB");
        Student student=new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11);
        student.setBicke(Optional.ofNullable(bicke));
        return student;
    };
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11);
        Student student2 = new Student("Aenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"),10);
        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"),12);
        Student student4 = new Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"),14);
        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"),7);
        Student student6 = new Student("Aames",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"),9);

     //   List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6,null);
        return students;
    }
}
