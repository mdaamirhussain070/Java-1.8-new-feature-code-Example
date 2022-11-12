package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example {
	
	public static void main(String[] args) {
		
		String pass="^(?=.*[a-zA-z0-9])";
		String pass2= "(?=.*[@$%&_]).{8,31}";
		String rexp="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\\]).{8,32}$";
		
		String regx="Pasword11@";
		String reg1="[a-zA-Z0-9]?[a-zA-Z0-9#$@%&_]+";
		String reg2="[#$@%&_]?";
//		Pattern p=Pattern.compile(pass);
//		Pattern p2=Pattern.compile(reg2);
//		Matcher m=p.matcher(regx);
//		Matcher m2=p2.matcher("Password123@@@@");
		if(regx.length()>=8 && regx.length()<=31) {
			System.out.println("pass");
			if(regx.matches(".*\\d.*")) {
				System.out.println("Pass");
				
				if(regx.matches(".*[a-z].*") && regx.matches(".*[A-Z].*" ) && regx.matches(".*[#@$%&_].*")) {
					System.out.println("Pass");
				}
				else {
					System.out.println("Error code 30");
				}
					
			}
			else {
				System.out.println("Error code 20");
			}
			
			
		}
		else {
			System.out.println("Error code 10");
		}
	}

}
