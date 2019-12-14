package fellowship;
import java.util.Scanner;
public class pof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
Scanner scanner=new Scanner(System.in);
System.out.println("enter the numner");
int n=scanner.nextInt();
scanner.close();
if (n > 31)
	System.out.println("enter number below 32");
else
	for(int i=0;i<=n;i++)
	{
		num= (int)Math.pow(2, i);
		System.out.println(num);
	}
	pof2 a =new pof2();
	a.lea(num);
	}
public static void lea(int year) {
	boolean leap=false;
	if(year%4==0)
	   {
		   if(year%100==0)
		   {
			   if(year%400==0)
				   leap=true;
			   else
				   leap=false;
		   }
		   else
		   leap=true;
	   }
	   else
		   leap=false;
	   if(leap)
		   System.out.println("year is leap year");
	   else
		   System.out.println("year is not a leap year");

	}

}
