package com.test;

import com.test.*;
public class SingletonDemo extends Thread{
    public void run(){
         SingletoClass s=SingletoClass.getSingletoClass();

    }
    public static void main(String[] args) {
       SingletonDemo t1=new SingletonDemo();
       SingletonDemo t2=new SingletonDemo();
        SingletonDemo t3=new SingletonDemo();
        SingletonDemo t4=new SingletonDemo();

        t1.start();
        t2.start();
        t3.start();
        t4.start();

//        SingletoClass s=SingletoClass.getSingletoClass();
//        SingletoClass s2=SingletoClass.getSingletoClass();
//
//        if(s==s2){
//            System.out.println("Referencing same object or having single object");
//        }else {
//            System.out.println("Referencing to different object or having multiple object");
//        }

    }
}
