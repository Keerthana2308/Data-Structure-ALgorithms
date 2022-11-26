import java.util.Scanner;

public class countTriplets 
{
	   public int count(int[] nums)
	   {
	        // code here
	       int  n=nums.length;
	        if(n<3)
	        {
	            return 0;
	        }
	        
	        int k=0;
	        int l=0;
	        int count=0;
	        int big=0;
	        int small=0;
	        for(int i=1;i<n;i++)
	        {
	            big=0;
	            small=0;
	            k=i-1;
	            l=i+1;
	            while(l<n)
	            {
	                if(nums[l]>nums[i])
	                {
	                    big++;
	                }
	                l++;
	            }
	            while(k>=0)
	            {
	                if(nums[i]>nums[k])
	                {
	                    small++;
	                }
	                k--;
	            }
	            
	            count=count+small*big;
	        }
	        return count;
	   }
	public static void main(String[] args) 
	{ 
		  Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] nums = new int[n];
	        for(int i = 0 ; i < n ; ++i) {
	            nums[i] = in.nextInt();
	        }
	        int result = new countTriplets().count(nums);
	        System.out.println(result);

	}

}
