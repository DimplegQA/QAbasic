package inheritence;

public class child extends parent{
	
	public static void main(String[] args) {
		child a = new child();
		a.ptest1();
		
		
	}
public void demo2() { // non static method
	System.out.println("child demo2");
}
public void demo3() {
	System.out.println("child demo3");
}
public void demo4() {
	System.out.println("child demo4");
}

}
