package defaults;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Comparator;
import java.util.List;


public class DefaultMethodsExample2 {
    public static void sortByName(List<Student> students){
        students.sort(Comparator.comparing(Student::getName));
        students.forEach(student -> System.out.println(student));

    }
    public static void sortByGpa(List<Student> students){
        students.sort(Comparator.comparingDouble(Student::getGpa));
        students.forEach(student -> System.out.println(student));

    }
    public static void comapartorChaning(List<Student> students){
        students.sort(Comparator.comparingDouble(Student::getGradeLevel).thenComparing(Student::getName));
        students.forEach(student -> System.out.println(student));

    }
    public static void sortWithNullValue(List<Student> students){

      Comparator<Student> studentComparator=  Comparator.nullsFirst(Comparator.comparing(Student::getName));
      students.sort(studentComparator);
        students.forEach(student -> System.out.println(student));

    }
    public static void main(String[] args) {
        List<Student> students= StudentDataBase.getAllStudents();
  //      students.forEach(student -> System.out.println(student));

 //       sortByName(students);
   //     sortByGpa(students);
     //   comapartorChaning(students);s
        sortWithNullValue(students);

    }
}
