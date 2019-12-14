package fellowship;
import java.util.Scanner;
public class twod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
System.out.println("enter number of rows and columns");
int m=v.nextInt();
int n=v.nextInt();
		int[][] arr =new int[m][n];
		System.out.println("enter the array");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=v.nextInt();
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
