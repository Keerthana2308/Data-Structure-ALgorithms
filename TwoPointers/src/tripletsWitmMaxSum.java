import java.util.Scanner;

public class tripletsWitmMaxSum 
{	
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextLong();
            long result = maxSumTriplet(n, arr);
            System.out.println(result);

    }

    static long maxSumTriplet(int n, long arr[]) 
    {
        long ans=0;
       for(int i=1;i<n-1;i++)
       {
           long max=0;
           long min=0;
           for(int j=0;j<i;j++)
           {
               if(arr[i]>arr[j]){
               min=Math.max(min,arr[j]);}
           }
           for(int j=i+1;j<n;j++)
           {
               if(arr[i]<arr[j])
               max=Math.max(max,arr[j]);
           }
           if(max>0 && min>0)
           {
               ans=Math.max(ans,min+max+arr[i]);

           }
       }
       return ans;
    }
}