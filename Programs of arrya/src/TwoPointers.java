import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoPointers {

    public int[][] mergeIntervals(int[][] intervals) 
    {
         if(intervals == null || intervals.length == 0){
        return intervals;
    }
    
    Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
    List<int[]> result = new ArrayList<>();
        
    int previous[] = intervals[0];

    result.add(previous);
    System.out.println(result);

        
    for(int i = 1; i < intervals.length; i++){
        
    int startTime = intervals[i][0];
    int endTime = intervals[i][1];
        
    // if previous end Time is >= current's start Time ( ex. [1,3] [2,4] since 3 > 2 merge)
    if(previous[1] >= startTime){
        previous[1] = Math.max(previous[1], endTime);
    }else{
        previous = intervals[i];
        result.add(previous);
    }
        
    }
        return result.toArray(new int[result.size()][0]);
        
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] nums = new int[n][2];

        for(int i = 0 ; i < n ;i++) 
        {
            nums[i][0] = scanner.nextInt();
            nums[i][1] = scanner.nextInt();
        }

        int[][] results = new TwoPointers().mergeIntervals(nums);

        for (int i = 0; i < results.length; ++i) {
            System.out.printf("%d %d\n", results[i][0], results[i][1]);
        }
    }
}