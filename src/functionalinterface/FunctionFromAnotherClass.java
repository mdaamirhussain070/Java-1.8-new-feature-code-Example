package functionalinterface;

public class FunctionFromAnotherClass {

    static String stringconcate(String str){
        return FunctionExample.f1.apply(str);
    }
    public static void main(String[] args) {
        String str=stringconcate("Hello world");
        System.out.println(str);
    }
}
