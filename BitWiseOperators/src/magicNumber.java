import java.util.Scanner;

public class magicNumber {
public static int magic(int n)
{
	int ans=0;
	int base=5;	
	while(n>0)
	{
		int last=n&1;
		System.out.println("last  "+last);
		n=n>>2;
		System.out.println("n  "+n);

		ans+=last*base;
		
		System.out.println("ans  "+ans);
		base=base*5;
	}
	return ans;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(magic(n));
	}

}
