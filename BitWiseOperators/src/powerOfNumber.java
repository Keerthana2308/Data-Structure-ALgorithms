import java.util.Scanner;

public class powerOfNumber {

	public static int power(int base,int power)
	{
		int ans=1;		
		while(power>0)
		{
			if((power&1)==1)
			{
			 ans*=base;
			}
			base=base*base;
			power=power>>1;
		}
				return ans;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int power=sc.nextInt();
		System.out.println(power(base,power));
	}

}
