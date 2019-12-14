package fellowship;
import java.util.Scanner;
public class quad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
System.out.println("enter the value of a b c");
int a=v.nextInt();
int b=v.nextInt();
int c=v.nextInt();
int delta=(b*b)-(4*a*c);
double x1=((-b+Math.sqrt(delta))/(2*a));
double x2=((-b-Math.sqrt(delta))/(2*a));
System.out.println("the two roots are "+x1+" and "+x2);
	}

}
