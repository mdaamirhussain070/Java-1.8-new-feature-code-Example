package stream_terminal;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class StreamsPartitioningBy {
    public static void partitioningBy_1(){
        Map<Boolean, List<Student>> student= StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(s->s.getGpa()>=3.8));
        System.out.println(student);
    }
    public static void main(String[] args) {
        partitioningBy_1();
    }
}
