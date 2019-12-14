package fellowship;
import java.util.Scanner;
public class monthlypay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v=new Scanner(System.in);
		System.out.println("enter the value of P,Y and R");
		int p=v.nextInt();
		int y=v.nextInt();
		int R=v.nextInt();
		
		int n=12*y;
		int r=R/(12*100);
		double payment=(p*r)/(1-Math.pow((1+r),(-n)));
		System.out.println("payment ="+payment);
	}

}
