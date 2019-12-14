package fellowship;
import java.util.LinkedList;
import java.util.Scanner;
public class prrmutation {
public static char[] swap(char[] c, int a, int b) {
	char temp=c[a];
	c[a]=c[b];
	c[b]=temp;
	return c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> list=new LinkedList<String>();
		int j=0;
Scanner v=new Scanner(System.in);
System.out.println("enter the string");
String s=v.next();
int n=s.length();
int m=1;
for(int k=n;k>0;k--)
	m=m*k;
char[] arr=s.toCharArray();
while(j!=m) {
for (int i=0;i<n;i++) {
	if(i<n-1)
		arr=swap(arr,i,i+1);
	else
		arr=swap(arr,0,n-1);
	
	list.add(new String(arr));	
}
j+=3;
}
System.out.println(list);
	}
}
