import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionsExample {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();

        Predicate<Student> p1=(s)->s.getName().charAt(s.getName().length()-1)=='y';
        List<Student> studentArrayList= StudentDataBase.getAllStudents();

        List<Student> sl=studentArrayList.stream().filter(p1).collect(Collectors.toList());

        System.out.println(sl);
//        Predicate<Integer> p= s->s>5;
//
//        List list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        System.out.println(list);
//
//        List l= (List) list.stream().filter(p).collect(Collectors.toList());
//
//        System.out.println(l);
//
//        List l1=(List)list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(l1);

    }

}
