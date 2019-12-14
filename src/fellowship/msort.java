package fellowship;
import java.util.Scanner;
public class msort {
	public static int[] sort(int[] arr,int n ) {
		int j=0;
			int m=n/2;
			int o=m+1;
		int[] a=new int[m];
		int[] b=new int[o];
		for (int i=0;i<m;i++)
			a[i]=arr[i];
		for (int i=m;i<n;i++)
		{
			b[j]=arr[i];
		j++;
		}
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for (int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		
		sort1(a);
		sort1(b);
		
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		System.out.println();
		for (int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		System.out.println();
		
		j=0;
		if (m!=o)
		{
			int i=0;
			while(i!=m) {
				if(b[i]<a[i])
				{
					arr[j++]=b[i];
					arr[j++]=a[i];
					i++;
				}
				else if(b[i]>a[i])
				{
					arr[j++]=a[i];
					arr[j++]=b[i];
					i++;
				}
				else
				{
					arr[j++]=a[i];
					arr[j++]=b[i];
					i++;
				}
			}
			arr[j++]=b[i];
		}
		else
		{
		for (int i=0;i<m;i++)
		{
			if(b[i]<a[i])
			{
				arr[j++]=b[i];
				arr[j++]=a[i];
			}
			else if(b[i]>a[i])
			{
				arr[j++]=a[i];
				arr[j++]=b[i];	
			}
			else
			{
				arr[j++]=a[i];
				arr[j++]=b[i];
			}
		}
		}
		sort1(arr);
		return arr;
	}
public static int[] sort1(int[] ar) {
	for (int i=0;i<ar.length;i++)
	{
		for (int x=i+1;x<ar.length;x++) {
			
		if (ar[i]>ar[x])
		{
			int temp=ar[i];
			ar[i]=ar[x];
			ar[x]=temp;
		}
	}
	}
	return ar;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner v= new Scanner (System.in);
System.out.println("enter the number");
int n=v.nextInt();
int[] a=new int[n];
System.out.println("enter the numbers");
for (int i=0;i<n;i++)
{
	a[i]=v.nextInt();
}
if ((n==0)||(n==1))
{
	for(int i=0;i<n;i++)
		System.out.println(a[i]);
}
else
	a=sort(a,n);
for(int i=0;i<n;i++)
	System.out.print(a[i]+" ");
	}

}
