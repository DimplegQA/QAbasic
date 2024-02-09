package javabasic;

import java.util.Scanner;

public class datatypes {
	public static void main(String[] args) {
	/*public — It is an access specifier for the Method.
	   Access specifiers are nothing but the keywords that set the Accessibility 
	   of the classes, methods, and other members. So, here we need to set the access 
	   specifier as public for the main method to enable access to the Run time environment 
	   so that JVM can make a call to the main method directly.*/
	
	/*
	  Static: static keyword is basically used when there is no object instance 
	  for the class, when the main method is called in run time it should be declared 
	  as static because we don’t have any object instance for the main method, 
	  if we didn’t declare as static for the main method, JVM can’t load the main method 
	  into the memory, and it throws an error.
	 */
	//jdk
		//jre
		//jvm
	
	/*
	  Void: Void keyword is used to identify that the method is not returning any data type. 
	  When the main program execution completes then Java Program also terminates, 
	  so if we are trying to return anything after the java program terminates 
	  it will throw a compilation error.
	 */
	
	
	/*
	 Main: the main method is the keyword used to identify the main method that JVM 
	 calls during the start of execution, if we didn’t provide a name as the main method, 
	 JVM can’t identify the main method to start the execution.
	 */
	
	
	/*
	  String [] args: args is an array of type String. Java's main method accepts the 
	  command line arguments of string data type. We can pass command line arguments from 
	  Java Run configurations at the run time.So here as args is just the identifier for 
	  the arguments we can keep not only args but also any other identifier like an ABC, 
	  any name, test etc.
	 */
	//public static void main(String[] args) {
		
		
	        char       o           =           97;
	    //  Datatype   variable    operater   value -literal(interger,char)   
	        char p= 'A';
	        
	 String c = "Dimple";
	 
	        // Integer data type is generally
	        // used for numeric values
	        int i = 89;
	 
	        // use byte and short
	        // if memory is a constraint
	        byte b = 127;// b++;
	       // b+=2;
	       b+=5;
	        System.out.println(b);
	        // this will give error as number is
	        // larger than byte range
	        // byte b1 = 7888888955;
	 
	        short s = 5000;
	        
	        s++;
	        
	        // this will give error as number is
	        // larger than short range
	        // short s1 = 87878787878;
	 
	        // by default fraction value
	        // is double in java
	        double d = 43433455566.35545353452;
	 
	        // for float use 'f' as suffix as standard
	        float f = 4.733343234f;
	       
	          //need to hold big range of numbers then we need this data type
	        long l = 12121;
	            
	        System.out.println("char: " + o);
	        System.out.println("char: " + p);
	        System.out.println("integer: " + i);
	        System.out.println("byte: " + b);
	        System.out.println("short: " + s);
	        System.out.println("float: " + f);
	        System.out.println("double: " + d);
	        System.out.println("long: " + l);
	        System.out.println("string: " + c);
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a value1: ");
	       int value1 =scanner.nextInt();
	      
	        System.out.print("Enter a value2: ");
	        int value2 = scanner.nextInt();
	        
int add=value1+value2;
System.out.println("add of two numbers:"+(add));


	        
	        
	        
	 }
	
	
	
	}