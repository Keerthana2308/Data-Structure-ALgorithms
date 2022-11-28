import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;
public class WaveSort {
	
		public static void main(String args[]){
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        List<Integer>nums = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            nums.add(sc.nextInt());
	        }
	        List<Integer>ans = wiggleSort(n,nums);
	        for (int i = 0; i < n; i++) {
	            System.out.print(ans.get(i)+" ");
	        }
	    }
	static void swap(List<Integer>arr, int a, int b)
	    {
	        int temp = arr.get(a);
	        arr.set(a,arr.get(b));
	        arr.set(b,temp);
	    }
	    static List<Integer> wiggleSort(int n, List<Integer>arr){
	   for(int i = 0; i < n-1; i++){
	          int curr=arr.get(i);
	          int next=arr.get(i+1);
	            if(((i%2==0) && (curr>next)) || ((i%2!=0) && curr<next))
	              
	              swap(arr, i, i+1);
	        }
	        return arr;
	     
	    }
	}
