package fellowship;
import java.util.Scanner;
public class windchill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
  System.out.println("enter the value of t and v");
  int t=sc.nextInt();
  int v=sc.nextInt();
  if ((t>50)|| (v>120)||(v<3))
  {
	  System.out.println("'t' cannot be greater than 50 and 'v'should be greater than 3 and less than 120");
  }
  else
  {
  double w=35.74+(0.6215*t)+(0.4275*t-35.75)*(Math.pow(v, 0.16));
	System.out.println(w);
  }
}
}
