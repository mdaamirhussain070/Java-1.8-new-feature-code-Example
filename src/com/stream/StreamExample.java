package com.stream;

import functionalinterface.Student;
import functionalinterface.StudentDataBase;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

      //  functionalInterface f=i->i.
        List<Student> l= StudentDataBase.getAllStudents();
        Map<String,Integer> m=new HashMap<String,Integer>();
        
        for(Student s:l) {
        	System.out.println(s.getGpa());
        }
        System.out.println("......................................");
        
        List l1=l.stream().map(e->{
        	if(e.getGpa()>3.5) {
        		e.setGpa(e.getGpa()*2);
        	}
        	
        	return e;
        }).collect(Collectors.toList());
        
        l.forEach(e->{
        	System.out.println(e.getGpa());
        });
        
        

    }
}
