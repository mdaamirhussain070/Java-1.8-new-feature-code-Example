package ProgramTest;

public class C {

    public static void main(String[] args) {
        A a=new A();
        a.m1();

        B b=new B();
        b.m1();
        A a1=new B();
        a1.m1();

        A a2= new B();

    }
}
