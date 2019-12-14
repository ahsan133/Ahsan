package fellowship;
import java.util.Scanner;
public class dist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
System.out.println("enter the numbers");
int x=v.nextInt();
int y=v.nextInt();
double distance=Math.sqrt((x*x)+(y*y));
System.out.println("distance = "+ distance);

	}

}
