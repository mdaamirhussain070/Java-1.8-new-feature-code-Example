package methodrefrence;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        MyFunInterface f = () -> System.out.println("FunInterface method called");
        f.method();

        MyFunInterface f1 = MethodReferenceDemo::method2;
        f1.method();
        MethodReferenceDemo obj=new MethodReferenceDemo();
        MyFunInterface f2=obj::method3;
        f2.method();


    }
    public static void method2(){
        System.out.println("method2 called");
    }

    public void method3(){
        System.out.println("method3 called ");
    }
}


interface MyFunInterface{
    void method();
}
