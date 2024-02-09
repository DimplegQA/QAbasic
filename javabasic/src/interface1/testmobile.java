package interface1;

public class testmobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		mobile s = new samsung();//Creating an object from class and  call using the mobile interface
		s.past();
		s.copy();
		s.cut();
		
		mobile a = new apple();
		a.past();
		a.cut();
		a.sms();
		
		mobile b =new sony();
		b.past();
		b.cut();
		b.sms();
		b.copy();
	}

}
