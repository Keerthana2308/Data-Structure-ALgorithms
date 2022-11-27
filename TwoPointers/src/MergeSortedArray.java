import java.util.Scanner;

public class MergeSortedArray {
	 public static int [] mergeSortedArray(int[] nums1, int m, int[] nums2, int n) 
	    {
	        int i=0;
	    int j=0;
	    int[] res=new int[m+n];
	    int k=0;
	    while(i<m && j<n)
	    {
	        if(nums1[i]<nums2[j])
	        {
	            res[k++]=nums1[i++];
	            
	        }
	        else 
	        {
	            res[k++]=nums2[j++];
	           
	        }
	    }
	while(i<m)
	{
	    res[k++]=nums1[i++];
	   
	}
	while(j<n)
	{
	    res[k++]=nums2[j++];
	  
	}
	return res;

	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int m = scanner.nextInt();
	        int n = scanner.nextInt();
	        int[] nums1 = new int[m];
	        int[] nums2 = new int[n];

	        for (int i = 0; i < m; i++)
	            nums1[i] = scanner.nextInt();
	        for (int i = 0; i < n; i++)
	            nums2[i] = scanner.nextInt();

	        scanner.close();

	        int[] nums = mergeSortedArray(nums1, m, nums2, n);
	        for (int i = 0; i < nums.length; i++)
	            System.out.print(nums[i] + " ");
	    }
	}