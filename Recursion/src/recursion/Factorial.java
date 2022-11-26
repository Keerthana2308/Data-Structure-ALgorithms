package recursion;

public class Factorial {
	
	static int fib(int n)
	{
		System.out.println("n value    "+n);
	    // Stop condition
	    if (n == 0)
	        return 0;
	 
	    // Stop condition
	    if (n == 1 || n == 2)
	        return 1;
	 
	    // Recursion function
	    else
	        return (fib(n - 1) + fib(n - 2));
	}
	 
	// Driver Code
	public static void main(String []args)
	{
	   
	    // Initialize variable n.
	    int n = 5;
	  // System.out.print("Fibonacci series of 5 numbers is: ");
	    // for loop to print the fibonacci series.
	    for (int i = 0; i < n; i++)
	    {
	        System.out.print(fib(i)+"");
	    }
	}
	}
	 