package test1;

import java.util.Scanner;

public class Emi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int sal = 450000;	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a emi1: ");
    int emi1 =scanner.nextInt();
    System.out.print("Enter a emi2: ");
    int emi2 =scanner.nextInt();
	
		int emtT=emi1+emi2;
		int sal1 = sal-emtT;
if (sal1 >500000 ) {
	sal1=(sal1*100)/5;
	System.out.println(sal1);
}	
else if (sal1<=500000){
	int finalsal2=sal1*100/20;
	System.out.println(finalsal2);	
	}
else if(sal1<=1000000) {
int finalsal3=sal1*100/30;
System.out.println(finalsal3);
}
}
	}