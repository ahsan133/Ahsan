package fellowship;
import java.util.Scanner;
public class sumof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
System.out.println("enter the number of integers");
int n=v.nextInt();
int[] a=new int[n];
System.out.println("enter the integers");
for(int i=0;i<n;i++)
{
	a[i]=v.nextInt();
}
int count=0;
for(int i=0;i<n-2;i++)
{
	for(int j=1;j<n-1;j++)
	{
		for(int k=2;k<n;k++)
		{
			int b=a[i]+a[j]+a[k];
			if(b==0)
			{
				System.out.print(a[i]+" "+a[j]+" "+a[k]+" ");
				count+=3;
			}
		}
	}
}
System.out.println(count);
	}

}
