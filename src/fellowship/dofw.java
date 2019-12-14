package fellowship;
import java.util.Scanner;
public class dofw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
		System.out.println("enter the date");
System.out.println("enter day");
int d=v.nextInt();
System.out.println("enter month");
int m=v.nextInt();
System.out.println("enter year");
int y=v.nextInt();
int y0=y-(14-m)/12;
int x=y0+y0/4-y0/100+y0/400;
int mo=m+(12*((14-m))/12)-2;
int d0=(d+x+(31*mo)/12)%7;
		System.out.println(d0);
		  
	}

}
