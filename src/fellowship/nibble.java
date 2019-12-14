package fellowship;
import java.util.Scanner;
public class nibble {
	
public static int[] tobin(int n) {
	int[] arr=new int[8];
	int i=7;
	while(n!=0) {
	int a=n%2;
	n=n/2;
	arr[i]=a;
	i--;
	}
	return arr;
}
public static int[] swap(int[] a) {
	int temp;
	for (int i=0;i<4;i++)
	{
		temp=a[i];
		a[i]=a[i+4];
		a[i+4]=temp;
	}
	return a;
}
public static int todec(int[] a) {
	int b=0;
	for(int i=7;i>=0;i--)
	{
		b+=a[i]*Math.pow(2, (7-i));
	}
	return b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nibble ab=new nibble();
		int[] arr=new int[8];
		
	Scanner v=new Scanner(System.in);
	System.out.println("enter the number");
	int n=v.nextInt();
	arr=ab.tobin(n);
	for(int i=0; i<8;i++)
	{
		System.out.print(arr[i]);
	}
	arr=ab.swap(arr);
	System.out.println();
	for(int i=0; i<8;i++)
	{
		System.out.print(arr[i]);
	}
	int a=ab.todec(arr);
	System.out.println();
	System.out.println(a);
	}

}
