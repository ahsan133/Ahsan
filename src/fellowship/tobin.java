package fellowship;
import java.util.Scanner;
public class tobin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[200];
		int[] b=new int[200];
		int i=0,k=0;
Scanner v= new Scanner(System.in);
System.out.println("enter the number");
int n=v.nextInt();
int temp=n;
while (n>0)
{
	a[i]=n%2;
	n=n/2;
	i++;
}
System.out.println();
System.out.print(temp+"=");
for (int j=i-1;j>=0;j--)
{
	int z=(int)(a[j]*(Math.pow(2, j)));
	if(z!=0)
	System.out.print(z);
	k++;
	if((k!=i)&&(z!=0))
	System.out.print("+");
	
}
	}
}
