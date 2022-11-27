import java.util.Scanner;

public class RemoveDuplicates {
	 public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        int n = sc.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();

	        int res = removeDuplicatesFromSortedArrayII(n, arr);

	        System.out.println(res);

	        for (int i = 0; i < res; i++)
	            System.out.print(arr[i] + " ");

	    }

	    static int removeDuplicatesFromSortedArrayII(int n, int[] arr) 
	    {
	       int st = 0;
	 
	    for (int i = 0; i < n; i++)
	     {
	 
	        if (i < n - 2
	            && arr[i] == arr[i + 1]
	            && arr[i] == arr[i + 2])
	            continue;
	 
	        else
	         {

	            arr[st] = arr[i];
	            st++;
	        }
	    }
	        return st;

	}
	    }