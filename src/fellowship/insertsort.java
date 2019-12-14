package fellowship;
public class insertsort {

	public static void main(String[] args) {
	
int[] arr= {3,4,2,5,1};
int n=arr.length;
for(int i=1;i<n;i++)
{
	int key=arr[i];
	int j=i-1;
	while( j>=0 && key<arr[j])
	{
		arr[j+1]=arr[j];
		j=j-1;
	}
		arr[j+1]=key;
	
}
for(int i=0;i<n;i++)
System.out.print(arr[i]+" ");
	}
}
