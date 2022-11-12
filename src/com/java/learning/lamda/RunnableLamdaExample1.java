package com.java.learning.lamda;

public class RunnableLamdaExample1 {

    public static void main(String[] args) {

        /**
         * prior java 8
         */
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        Runnable runnablelambda=()->{
            System.out.println("inside Lambda implementation of in Runnable");
        };
        new Thread(runnablelambda).start();

        new Thread(()-> System.out.println("Inside Runnable 3.1")).start();
    }
}
