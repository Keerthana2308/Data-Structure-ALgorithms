import java.util.*;

class NumSort {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        String sortedArray[] = numSort(n, arr);

        for (String num : sortedArray) {
            System.out.print(num + " ");
        }

    }

    static String[] numSort(int n, String[] arr) 
    {
        Arrays.sort(arr, (left, right) ->
        {
            if (left.length() != right.length())
                return left.length() - right.length();
             return left.compareTo(right);
        });
        return arr;
    }
}