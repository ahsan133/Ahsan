package fellowship;
import java.util.Scanner;
public class findthenum {

	public static int sep(int lo,int hi) {
		int mid= (int)(lo+(hi-lo)/2);
		return mid;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
System.out.println("enter the number");
int n=v.nextInt();
System.out.println("think a number between 0 and "+n);
int hi=n;
int lo=0;
while(lo<hi) {
int mid=sep(lo,hi);
if((lo==mid)||(mid==hi)) {
	System.out.println("your number is "+mid);
break;}
else
{
System.out.println("is your number between "+lo+" and "+ (mid-1));
System.out.println("enter 1 for yes and 0 for no");
int in=v.nextInt();
if(in==1)
	hi=mid;
else
	lo=mid;
}
}
	}
	
}
