//Array Rotation left Using temp array
// Time complexity : O(n) 
// Auxiliary Space : O(d)

public class ArrayRotat1 {
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6};
		int n=arr.length;
		int d=2;
		int tmp[]=new int[d];
		for(int i=0;i<d;i++)
		{
			tmp[i]=arr[i];
		}
		for(int j=d;j<n;j++)
		{
			arr[j-d]=arr[j];
		}
		for(int i=0;i<d;i++)
		{
			arr[i+n-d]=tmp[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
