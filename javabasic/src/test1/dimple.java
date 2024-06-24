package test1;

public class dimple {
public static void main(String[] args) {
	//object
	dimple obj = new dimple();
	obj.add();
	obj.add(4, 80);
	obj.test();
	
}
//methods three different ways

// with no ip and op
public void test() {
	System.out.println("hi i am in test method");
}
//with no ip and op
public void add() {
	int a =9;
	int b =9;
	System.out.println(a+b);
}
//with in and op
public void add(int x , int y) {
	
	System.out.println(x+y);
}
}
