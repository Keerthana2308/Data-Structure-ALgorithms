import java.util.Scanner;

public class noOfBits {

	public static int bits(int n)
	{
		int k=-10;
		int count=0;
		System.out.println(Integer.toBinaryString(k));
		System.out.println(Integer.toBinaryString(n));

		while(n>0)
		{
			n=n&(n-1);
			count++;			
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(bits(n));
	}

}
