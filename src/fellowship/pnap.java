package fellowship;
import java.util.Scanner;

public class pnap {
	public static int[] pal(int[] a, int c) {
		int[] arr=new int[10000]; 
		int k=0;
		for (int i=0;i<c-1;i++) {
			int x=a[i];
			for (int y=i+1;y<c;y++)
			{
				int z=a[y];
				if((x==0)||(z==0))
					continue;
				int q=anag(x,z);
				
				if (q==0)
				{
					
					arr[k++]=x;
					arr[k++]=z;
				}
			}
		}
		return arr;
	    }
	public static int anag(int a, int b) {
		int h=0;
		int[] ar=new int[10];
		int[] ab=new int[10];
		int count1=0,count2=0;
		while(a!=0) {
		int n=a%10;
		ar[n]++;
		count1++;
		a/=10;
		}
		while(b!=0) {
			int m=b%10;
			ab[m]++;
			count2++;
			b/=10;
		}
		if(count1!=count2)
		h=1;
		else
		{
		    for(int i=0;i<10;i++) {
		    if(ab[i]!=ar[i])
		    	h=1;
		    else 
		    	h=0;
		}
		}
		return h;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v=new Scanner(System.in);
		
		int k=0;
		System.out.println("enter the range 0-1000");
		int f=v.nextInt();
		int t=v.nextInt();
		v.close();
		int count=0;
		int[] arr=new int[t/2];
	
		while(f<t) {
			boolean flag = false;
            for(int i = 2; i <= f/2; ++i) {
                if(f % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(f + " ");
            arr[k++]=f;
            ++f;
            count++;
      
		}
		System.out.println();
		
		for (int i=0;i<arr.length;i++) 
			System.out.print(arr[i]+" ");
			System.out.println();
			
		arr= pal(arr,count);
for (int z=0;z<arr.length;z++)
		System.out.print(arr[z]+" ");
	}

}
