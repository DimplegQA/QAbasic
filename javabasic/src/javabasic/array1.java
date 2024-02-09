package javabasic;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	method.add(45, 54);
		
   /* int[] n= {1,2,3,8,6,5,4,9,11,12,111,123};
    // System.out.println(n[2]);
    for(int i=0;i<=n.length;i++) {
    	System.out.println(n[i]);
    }*/
    int[][] s = { { 1, 2 }, { 3, 4 } };
	int m=s[0].length;
    for (int i = 0; i < s.length; i++) {
        for (int j = 0; j < m; j++) {
         System.out.print(s[i][j] + " ");
        }System.out.println();
    }

		int a[]= new int[5];
		a[0]=100;
		a[1]=101;
		a[2]=102;
		a[3]=103;
		a[4]=104;
     
		for(int i=0;i<5;i++) {
			System.out.println(a[i]);
		}
		
		
		
		
		
		
    
     
    //System.out.println("array :"+"a[0]"+a[0]+a[1]+a[2]);
     
   /*  for(int i=0;i<a.length;i++) {
    	 System.out.println(a[i]);
     }
   for(int i=0;i<n.length;i++) {
    	 System.out.print(n[i]+",");
     }
    System.out.println();
 System.out.println("This is the static variable value:"+array.dimple);*/
	}

}
