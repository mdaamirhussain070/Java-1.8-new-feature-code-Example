package parallelStream;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamPipelineExample {
    public static void sequentialStream(){
        long startTime=System.currentTimeMillis();
         StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
         long endTime=System.currentTimeMillis();
        System.out.println("Duration to Execute in Sequential Stream : "+(endTime-startTime));
    }
    public static void parrallelStream(){
        long startTime=System.currentTimeMillis();
         StudentDataBase.getAllStudents().stream()
                 .parallel()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .collect(Collectors.toList());
        long endTime=System.currentTimeMillis();
        System.out.println("Duration to Execute in parallel Stream : "+(endTime-startTime));
    }
    public static void main(String[] args) {
        sequentialStream();
        parrallelStream();
    }
}
