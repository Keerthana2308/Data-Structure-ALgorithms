import java.util.Scanner;

public class PrimeNumber {

	public static int[] prime_numbers( int n)
	
	{
		int arr[]=new int[n];
		int counter=0;
	    int k=2;
		while(counter<n)
		{
			boolean  flag=true;		
		for(int i=2;i<k;i++)
		{	
			if(k%i==0)
			{
				flag=false;
				break;
			}
		}
		 if(flag)
		 {
			 arr[counter]=k;
			 counter=counter+1;
		 }
		 k=k+1;
	}
		return arr;
	}
public static void main(String[] args) 
	{
		    Scanner sc=new Scanner(System.in);
	        int n =sc.nextInt();
	        int[] output = prime_numbers(n);
	        for(int i=0;i<n;i++)
            System.out.println(output[i]);
	}

}
