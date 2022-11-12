package methodrefrence;

import functionalinterface.Student;

import java.util.function.Predicate;

public class ReFactorMethodExample {
    static Predicate<Student> p=(s)->s.getGpa()>=3;

    public static void main(String[] args) {

    }
}
