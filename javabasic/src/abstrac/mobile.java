package abstrac;


	//Example of an abstract class that has abstract and non-abstract methods  
	 abstract class MI{  
		 
	   MI(){System.out.println("note5pro");}  
	   
	   abstract void run();  
	   
	   void changeGear(){System.out.println("gear changed");}  
	         }  
	//Creating a Child class which inherits Abstract class  
	 class sony extends MI{  
		 
	 void run(){System.out.println("running safely..");}  
	 }  
	//Creating a Test class which calls abstract and non-abstract methods  
	 class mobile{  
	 public static void main(String args[]){  
		 //creating the object for the  class and calling the abstract class
	  MI obj = new sony();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}  

