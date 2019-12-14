package fellowship;
import java.util.Scanner;
public class ly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean leap=false;
   Scanner scanner=new Scanner(System.in);
   System.out.println("enter the year");
   int year=scanner.nextInt();
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
