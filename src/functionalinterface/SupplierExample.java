package functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> supplier=()->{
        return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"),13);
    };
    static Supplier<List<Student>> supplier2=()->StudentDataBase.getAllStudents();
    public static void main(String[] args) {

        System.out.println("Suppier Result : "+supplier.get());
        System.out.println("Supplier Result 2 "+supplier2.get());
    }
}
