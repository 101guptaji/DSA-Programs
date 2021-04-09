// Array Rotation left by Rotating one by one
// Time complexity : O(n * d) 
// Auxiliary Space : O(1)

public class ArrayRotat2 {
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7};
		int n=arr.length;
		int d=2;
		int tmp;
		for(int j=0;j<d;j++)
		{
			tmp=arr[0];
			for(int i=0;i<n-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[n-1]=tmp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
