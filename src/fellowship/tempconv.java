package fellowship;
import java.util.Scanner;
public class tempconv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v=new Scanner(System.in);
		System.out.println("enter '1' to convert from celcius to farenhite and '2'to convert from farenthie to celsius");
		int n=v.nextInt();
		if ((n!=1)&&(n!=2))
		{
			System.out.println("enter the valid input");
		}
		if (n==1)
		{
			System.out.println("enter the temp in celcius");
			int c=v.nextInt();
			int temp=(c*9/5)+32;
			System.out.println("temp ="+temp+"F");
		}
		if(n==2)
		{
			System.out.println("enter the temp in farenhite");
			int f=v.nextInt();
			int temp=(f-32)*5/9;
			System.out.println("temo ="+temp+"C");
		}
	}

}
