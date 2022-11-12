package stream_terminal;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {
    public static int sumExample(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(summingInt(Student::getNoOfNoteBook));
    }
    public static Double avgExample(){
        return StudentDataBase.getAllStudents()
                .stream()
                .collect(averagingInt(Student::getNoOfNoteBook));
    }
    public static void main(String[] args) {
        System.out.println(sumExample());
        System.out.println(avgExample());
    }
}
