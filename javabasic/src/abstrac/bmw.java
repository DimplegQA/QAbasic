package abstrac;

import Abstraction.Dell;

public abstract class bmw {
	// non abstract method
	//creating the method in a abstrac class
 public static void color() {
	 System.out.println("red");
 }
 public static void model() {
	 System.out.println("s2");
 }
 // abstract method
 //creating the abstrac method in a abstrac class
 abstract void version();
public static void main(String[] args) {
	
	color();

	
}
}
