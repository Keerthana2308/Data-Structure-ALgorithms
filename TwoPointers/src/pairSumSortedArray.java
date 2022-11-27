import java.util.Scanner;

public class pairSumSortedArray {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        boolean res = twoSumInSortedArray(n, arr, k);

        String ans = (res) ? "Present" : "Not Present";

        System.out.println(ans);

    }

    static boolean twoSumInSortedArray(int n, int arr[], int k) {

        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==k)
            {
                return true;
            }
            else if(arr[i]+arr[j]>k)
            {
                j--;
            }
            else if(arr[i]+arr[j]<k)
            {
                i++;
            }
        }
        return false;
    }
}