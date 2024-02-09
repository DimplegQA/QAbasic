package javabasic;
public class methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		methodoverloading v = new methodoverloading();
		
		v.test(12, 015);
		v.test(45, 88);
		v.test(12, 45, 8);
	}
public void test()
{
	System.out.println("hi");
}	
public void test(int x,int y)
{
	int c=x+y;
	System.out.println("hi");
	System.out.println(c);
}	
public void test(int x)
{
	System.out.println(x);
}
public void test(int x,double y)
{
	//double c=x+y;
	System.out.println("hi");
	System.out.println(x+y);
}
public void test(double x)
{
	System.out.println(x);
}
public void test(int x,int z,int i)
{
	System.out.println(x+z+i);
}
public void test(double x,int i)
{
	System.out.println(x);
}
}
	

