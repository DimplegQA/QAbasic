package javabasic;

public class condition {

	public static void main(String[] args) {
		//0 to 100
        int marks = 180;
        if (marks <= 20) {       	
        	System.out.println("student grade is F "+ marks);
        	}
        	else if (marks<= 40){
        		 
        	System.out.println("student grade is D " +marks);
             }
        
        	else if (marks<= 50){
        		     		
            	System.out.println("student grade is C "+marks );
                 }
        	else if (marks<=70) {
        		
            	System.out.println("student grade is B " +marks);
        	}
        	else if (marks<= 90){
        		//80<=90
            	System.out.println("student grade is A " +marks);
                 }
        	else if(marks<=100)
        	{
        		System.out.println("student grade is A+" );
        	}
        	else
        		System.out.println("marks is invalide");
        	}
    }
    


