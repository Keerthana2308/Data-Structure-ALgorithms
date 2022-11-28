import java.util.Scanner;

public class uniqueElement {

	public static int unique(int[] arr)
	{
		int element=0;
		for(int i:arr)
		{
			element^=i;
			System.out.println(element);
		}
		return element;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
System.out.println(unique(arr));
	}

}
