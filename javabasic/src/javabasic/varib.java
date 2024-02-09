package javabasic;

public class varib {
	 static  String school = "adc school";
     static int section = 4;  //global variables     
     static int studytime,playtime,breaktime;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  varib dimple= new varib();//creating the object in class its allocat unique memory for each object
				dimple.studytime=5;
				dimple.playtime=4;   // local which can be access with in the object                        
				dimple.breaktime=2;
				System.out.println("dimple studytime is "+dimple.studytime);//we are calling with refernce using object name.
				System.out.println("dimple playtime is "+dimple.playtime);
				System.out.println("dimple breaktime is "+dimple.breaktime);
				
				System.out.println("dimple school is "+varib.school);// we are calling with refernce using class name
				System.out.println("dimple section is "+varib.section);
				
				varib supriya= new varib();
				supriya.studytime=8;
				supriya.playtime=6;
				supriya.breaktime=2;
				System.out.println("supriya studytime is "+supriya.studytime);
				System.out.println("supriya playtime is "+supriya.playtime);
				System.out.println("supriyabreaktime is "+supriya.breaktime);
				System.out.println("supriya school is "+varib.section);
				System.out.println("supriya school is "+varib.school);
			
				varib s2= new varib();
				s2.studytime=8;
				s2.playtime=4;
				s2.breaktime=2;
				System.out.println("s2 studytime is "+s2.studytime);
				System.out.println("s2 playtime is "+s2.playtime);
				System.out.println("s2 break time is "+s2.breaktime);
				System.out.println("s2 school is "+varib.school);
				
				
				varib s3= new varib();
				s3.studytime=8;
				s3.playtime=4;
				s3.breaktime=2;
				System.out.println(s3.studytime);
				System.out.println(s3.playtime);
				System.out.println(s3.breaktime);
				System.out.println(varib.section);
				
				varib s4= new varib();
				s4.studytime=5;
				s4.playtime=4;
				s4.breaktime=4;
				System.out.println(s4.studytime);
				System.out.println(s4.playtime);
				System.out.println(s4.breaktime);
				System.out.println(varib.section);
	}

}
