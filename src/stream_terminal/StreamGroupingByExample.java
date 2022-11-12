package stream_terminal;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {
    public static void groupingByExample(){
        Map<String, List<Student>> studentMap=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
        studentMap.entrySet().forEach(s-> System.out.println(s.getKey() +":"+s.getValue()));
    }
    public static void groupingByCustomizeExample(){
        Map<String, List<Student>> studentMap=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(s->s.getGpa()>3.8?"OUTSTANDING":"AVERAGE"));
        studentMap.entrySet().forEach(s-> System.out.println(s.getKey() +":"+s.getValue()));
    }
    public static void twoLevelOfGroupBy(){
    Map<Integer,Map<Integer,List<Student>>> twolevelgroupMap= StudentDataBase.getAllStudents()
                .stream()
                        .collect(groupingBy(Student::getGradeLevel,groupingBy(Student::getNoOfNoteBook)));
        //        .collect(groupingBy(Student::getGradeLevel,groupingBy(s->s.getGpa()>=3.8?"OUTSTANDING":"AVERAGE")));
        System.out.println(twolevelgroupMap);
    }
    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentHashset=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println(studentHashset);
    }
    public static void calculateTopGpa(){
        Map<Integer,Optional<Student>> studentOptional=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentOptional);
        Map<Integer,Student> studentOptional1=StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(
                        maxBy(Comparator.comparing(Student::getGpa)) ,Optional::get)));
        System.out.println(studentOptional1);
    }

    public static void main(String[] args) {
    //    groupingByExample();
    //    groupingByCustomizeExample();
    //    twoLevelOfGroupBy();
    //      threeArgumentGroupBy();
        calculateTopGpa();

    }
}
