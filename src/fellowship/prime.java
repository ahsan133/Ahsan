package fellowship;
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
System.out.println("enter the number");
int num=v.nextInt();
for(int i=2; i<=Math.sqrt(num);i++)
{
	while(num%i==0)
	{
		System.out.println(i);
	num=num/i;
	}
}
if(num>2)
	System.out.println(num);
	}

}
