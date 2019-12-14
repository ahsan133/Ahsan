package fellowship;
import java.util.Scanner;
public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=0,i=0,c=0;
Scanner v=new Scanner(System.in);
int[] ar= {1000,500,100,50,10,5,2,1};
System.out.println("enter the amount");
int n=v.nextInt();
int n1=n;
while(n1!=b)
{
	int a=n/ar[i];
	b+=ar[i]*a;
	System.out.println(ar[i]+" notes: "+a);
	n=n-(ar[i]*a);
	i++;
	c+=a;
}
System.out.println("the least number of notes= "+c);
	}

}
