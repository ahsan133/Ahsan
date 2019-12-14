package fellowship;
import java .util.Scanner;
public class regex {
public static void main(String[] args) {
	Scanner v=new Scanner(System.in);
	String s=new String("Hello <<name>>, We have your full name\n" + 
			 "as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n" + 
				"Please,let us know in case of any clarification Thank you BridgeLabz 01-01-2016.");
	System.out.println("enter your full name");
	String name=v.next();
	System.out.println("enter 10 digit contact number");
	String num=v.next();
	System.out.println("enter the date in the format dd-mm-yyyy");
	String date=v.next();
	
	String[] s1=name.split(" ",2);
	System.out.println(s1[0]+" "+s1[1]);
	String s2=s.replace("<<name>>",s1[0]);
	String s3=s2.replace("<<full name>>",name);
	String s4=s3.replace(, date);
	String sf=s4.replace
	System.out.println(s3);
   }
}
