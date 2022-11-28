import java.util.Scanner;

public class SpiralMatrix 
{	
	static int[][] spiral(int n)
	{
		int[][] arr=new int[n][n];
		int R=n;
		int C=n;
		int row=0;
		int col=0;
		int k=1;
		while(row<R && col<C)
		{
			for(int i=col;i<C;i++)
			{
				arr[row][i]=k++;
			}
			row++;
			for(int i=row;i<R;i++)
			{
				arr[i][C-1]=k++;
			}
			C--;
			if(row<R && col<C)
			{
				for(int i=C-1;i>=col;i--)
				{
					arr[R-1][i]=k++;
				}
				R--;
				for(int i=R-1;i>=row;i--)
				{
					arr[i][col]=k++;
				}
				col++;			
			}
		}		
		return arr;
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		 int n = scanner.nextInt();

	     
	        int[][] results = new SpiralMatrix().spiral(n);
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(results[i][j] + " ");
	            }
	            System.out.println();
	        }
		
		
	}
}
