package javabasic;

public class function {
static int school=12;//g
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		function o=new function();
		
		
		
		o.add();
		o.sub();
		//obj.test();
		o.mul(25,65);
		//o.
		System.out.println(school);
	}
public  void add() {  // on input no out put 
	System.out.println("hi add");
}
public  void sub() { //on input with some output
	int x=10;
	int y=4;
	System.out.println("sub of "+ (x-y));
}
public void mul(int x,int y) { //with input and output
	int c=x*y;
	System.out.println(c);//non-static	
}
public void mul(int x) { //with input and output
	//int c=x*y;
	System.out.println(x);//non-static	
}
//string.studentclass=obj.dimple;
}
