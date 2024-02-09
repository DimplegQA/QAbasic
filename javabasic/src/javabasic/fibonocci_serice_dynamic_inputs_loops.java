package javabasic;

import java.util.Scanner;

public class fibonocci_serice_dynamic_inputs_loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0 1 1 2 3 5 8 
int a=0,b=1,s;
try (Scanner scanner = new Scanner(System.in)) {
	System.out.print("enter range of fibonocci serices ");
	int n = scanner.nextInt();
	
	int[] m = new int[n];
	//int n =400;
	System.out.println("Enter the numbers:");//a=0  b=1  s=1
	System.out.print(a+" ");			     //a=1  b=1  s=2
	System.out.print(b+" ");                 //a=1  b=2  s=3
	s=a+b;									//a=2   b=3  s=5
										   //a=3    b=5  s=8
	while(n>s) {
		System.out.print(s+" ");
		a=b;
		b=s;
		s=a+b;
	}
}
	}}


