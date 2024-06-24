package javabasic;
public class s1ample1 {
	
	public static void main(String[] args) {
		
		
		
		
	 // 50 45 40 35 30 25  -- 5
				int[][] b = {{1,2,3},{4,5,6},{7,8,9}};
	
	//	for(int i;i<=b.length;i++) {
			
			//for(int j;j<=b.length;j++) {
				//System.out.println(b[i][j]);
		
	
	
	














for(int i=0;i<=b.length;i++) {//coloum
			//step1:   0   0<6  
			//step5    1    1<6
			//step10   2    2<6
			for(int j=0;j<=2;j++) {//row
	 // step2        0   0<=0  1  :F
	//step6          0   0<=1  1
	//step8:         1   1<=1	2	:F	     
				System.out.print(b[i][j]+" ");}//step3: *
			                           //step7:**
			System.out.println();// step4: //step9:
			
}}}