package fellowship;
import java.util.Arrays;
import java.util.Scanner;
public class binsearch {
	
public static int bin(String[] arr, String s, int n) {
	int l=0; 
	int r=n-1;
	while(l<=r) {
	int mid=l+(r-l)/2;
	 int a=s.compareTo(arr[mid]);
	 if(a==0)
		 return 0;
	 else if(a>0) 
		 l=mid+1;
	 else 
		 r=mid-1;
}
return 1;
	 
	  }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner v=new Scanner(System.in);
		binsearch ab=new binsearch();
  System.out.println("enter the number of words");
  int n=v.nextInt();
  String[] name=new String[n]; 
  System.out.println("enter the words");
 for (int i=0;i<n;i++)
 {
	 name[i]=v.next();
 }
 Arrays.parallelSort(name);
 for (int i=0;i<n;i++)
 {
  System.out.print(name[i]+" ");
 }
 System.out.println();
  System.out.println("enter a word to be searched");
  String s=v.next();
  v.close();
  
  int res=ab.bin(name,s,n);
  if(res==0)
	  System.out.println("word found");
  else
	  System.out.println("word not found");
 
   
	}

}