package com.methodreference;

public class MyInterfaceImpl{


    public static void main(String[] args) {

        MyInterface intr= ()-> System.out.println("Fun method called through Lambda");
        intr.fun();

        Myterface2 intr2=(a,b)-> System.out.println("Fun method sum :"+(a+b));
        intr2.funAdd(1,3);

        MyInterface3 itr3=(a,b)-> a*b;
        int i=itr3.funMultiplication(3,5);
        System.out.println(i);

        MyInterface4 intr4=(a,b)->a>b;
        boolean b=intr4.funMyInterfaceBoolean(10,10);
        System.out.println(b);

    }
}

