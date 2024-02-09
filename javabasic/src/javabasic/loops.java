package javabasic;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows =4;
		//s1ample1.add(65, 45);
        for (int i =1;i <= rows; i++) {
        	
        	 //  0  0<=4 0+1=1
        	//  1
            for (int j = 2*(rows-i); j >0 ; j--) {
            	   // 2*(4-1)
            	   //  
              
                    System.out.print(" ");
                    
                } 
            for (int j =1; j <= i; j++) {
            	//0   0<=   0<=1
            	//1 1<=0
                	System.out.print("*");	
                }
                System.out.println(" ");
                }
        
            }
            
}


