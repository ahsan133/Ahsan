package fellowship;
import java.util.Scanner;
public class sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v=new Scanner(System.in);
		System.out.println("enter the number");
		double epsilon=1e-15;
		double c=v.nextInt();
		double t=c;
		while(Math.abs(t - c/t) > epsilon*t)
		{
			t=(t+c/t)/2.0;
		}
		System.out.println(t);
		

	}

}
