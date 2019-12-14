package fellowship;
import java.util.Scanner;
public class harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h=0;
Scanner v=new Scanner(System.in);
System.out.println("enter the number");
int n=v.nextInt();
v.close();
if(n!=0)
{
	for(int i=1;i<=n;i++)
	h+=(1/i);
}
else
	System.out.println("number cannot be 0");
System.out.println(h);
	}

}
