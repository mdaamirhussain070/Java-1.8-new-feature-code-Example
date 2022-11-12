package stream;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {

    static Predicate<Student> p1=(s)-> {
        char[] st = s.getName().toCharArray();
        if(st[0]=='A' || st[0]=='a')
        {
            return true;
        }

        return false;
    };

//ArrayList


    //cat,dog,cat,fox,cat



   // Function<Student,Student> f=s->s.getGpa()*2;
    public static List<Student> StudentNameFiltered(){

         List<Student> sn= StudentDataBase.getAllStudents().stream()
              //  .filter(p1)
              //   .map(e->new Student(e.getName(), e.getGradeLevel(),e.getGpa()*2,e.getGender(),e.getActivities()))
                .map(e-> StreamExample1.gpaDouble(e))
                .collect(Collectors.toList());

         return sn;
    }
    public static Student gpaDouble(Student st) {
    	st.setGpa(st.getGpa()*2);
    	return st;
    }

    public static void main(String[] args) {
//
//        Map<String,List<String>> studentmap= StudentDataBase.getAllStudents().stream()
//                .filter(student -> student.getGpa()>=3.9)
//                .filter(student -> student.getGpa()>=3)
//                .collect((Collectors.toMap(Student::getName,Student::getActivities)));
//
//        System.out.println(studentmap); 
        System.out.println(StudentNameFiltered());
    }
}
