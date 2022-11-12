package streamAPImethods;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static int performMultification(List<Integer> integers){

        return integers.stream()
                .reduce(1,(a,b)->a*b);
    }
    public static Optional<Integer> performMultificationWithoutIdentity(List<Integer> integers){

        return integers.stream()
                .reduce((a,b)->a*b);
    }
    public static Optional<Student> getHighestGpaStudent(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2)->(s1.getGpa()>s2.getGpa())?s1:s2);

    }
    public static void main(String[] args) {
        List<Integer> integers= Arrays.asList(1,3,5,7);
        int result=performMultification(integers);
        System.out.println(result);
        Optional<Integer> result1=performMultificationWithoutIdentity(integers);
        System.out.println(result1.get());
        System.out.println(getHighestGpaStudent().get());
    }
}
