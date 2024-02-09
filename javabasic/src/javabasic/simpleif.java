package javabasic;

import java.util.Scanner;

public class simpleif {

	public static void main(String[] args) {
		//method1.add();
		// TODO Auto-generated method stub	
		        Scanner scanner = new Scanner(System.in);// use to take input from user
		        System.out.print("Please enter your age: ");//to display the text in console
		       // String age = scanner.nextLine();
		        int age = scanner.nextInt();
  
//line is used to read the user's input from the command line interface and store it as a string variable. This allows us to manipulate and process the user's input within our program.

		        if (age<=80) {
		           // int A = Integer.parseInt(age);
		            System.out.println("Your age is " + age);
		        } else {
		            System.out.println("Sorry, it's not a valid age");
		        }
		    }
		
	}


