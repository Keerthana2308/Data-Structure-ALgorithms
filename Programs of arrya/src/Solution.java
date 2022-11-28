import java.util.Scanner;

public class Solution {
	  public static boolean checkPossibility(int[] n) 
	    
	   {
	        int result=0;
	        for (int i = 1; i < n.length; i++)
	        {
	            if (n[i] < n[i - 1])
	            {

	                result=n[i];
	                n[i-1]=result; 
                   break;
	            }
	        }             
	        System.out.println(n[1]);

	         for (int i = 1; i < n.length; i++)
	                 
	                 {
	                   if (n[i] < n[i - 1])
	                    return false;
	                   //    break;
	                    } 
	        return true;

	    }
	public static void main(String[] args) {
		int[] n= {5,7,1,8};
		// Scanner sc=new Scanner(System.in);
	//        int n =sc.nextInt();
	       boolean  output = checkPossibility(n);
	    //    for(int i=0;i<n;i++)
	        	
         System.out.println(output);
	}

}
