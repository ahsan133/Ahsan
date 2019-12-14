package fellowship;
import java.util.Arrays;
import java.util.Scanner; 
public class anagram {
	public static boolean cmp(char[] a,char[] b)
	{
		int n=a.length,count=0;
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		for(int i=0;i<n;i++)
		{
			if (a[i]==b[i])
				count++;
		}
		if (count==n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v=new Scanner(System.in);
boolean flag=false;
System.out.println("enter the first string");
String s1=v.next();
System.out.println("enter the second string");
String s2=v.next();
int n1=s1.length();
int n2=s2.length();
if (n1!=n2)
	System.out.println("they are not anagram");
else
{
	char[] c1=s1.toCharArray();
	char[] c2=s2.toCharArray();
	flag=cmp(c1,c2);
	}
if (flag)
	System.out.println("anagram");
else
	System.out.println("not anagram");
	}

}
