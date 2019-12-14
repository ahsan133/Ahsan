package fellowship;
public class bsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {3,4,2,5,1};
int n=arr.length;
for (int i=0;i<n;i++)
{
	for(int j=i+1;j<n;j++)
	{
		if(arr[j]<arr[i])
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
}
for (int i=0;i<n;i++)
	System.out.print(arr[i]+" ");
	}

}
