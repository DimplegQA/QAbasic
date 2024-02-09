package javabasic;

public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		String s[][]=new String[4][4]	;
		s[0][0]= "12";
		s[0][1]= "1";
		s[0][2]= "12";
		s[0][3]= "12";
	
		s[1][0]= "12";
		s[1][1]= "12";
		s[1][2]= "1";
		s[1][3]= "12";
		
		s[2][0]= "1";
		s[2][1]= "12";
		s[2][2]= "12";
		s[2][3]= "12";
		
		s[3][0]= "12";
		s[3][1]= "12";
		s[3][2]= "12";
		s[3][3]= "1";
for(int  i=0;i<4;i++) {
	for(int j=0;j<4;j++) {
		System.out.print(s[i][j]+" ");
	}
	System.out.println();
}



	}}

/*



int[][] s = { {1,2,4,7},{ 3,4,5,6 },{1,2,3,9},{4,7,8,7}};
	int k=s.length; //s[4]
    	int m=s[0].length;
    	System.out.println(s[3][2]);
        for (int i = 0; i < k; i++) {
          for (int j = 0; j < k; j++) {
                System.out.print(s[i][j]+" ");
            }
 
            System.out.println("");
        }
	}}*/


