import java.util.Scanner;

public class oddOReven {

	public static String check(int n)
	{
		if((n&1)!=1)
		{
			return "Even";
		}
		return "Odd";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(check(n));

	}

}
