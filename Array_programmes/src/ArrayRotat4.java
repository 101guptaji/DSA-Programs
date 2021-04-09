import java.util.Scanner;

//Array Rotation left by using reversal algorithm
//Time complexity : O(n) 
//Auxiliary Space : O(1)

public class ArrayRotat4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int i=0;
		while(i<n){
			arr[i]=sc.nextInt();
			i++;
		}
		
		int d=sc.nextInt();
		d=d%n;
		if(d>0){
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		}
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void reverse(int[] arr, int start, int end) {
		
		int tmp;
		while(start<end)
		{
			tmp=arr[end];
			arr[end]=arr[start];
			arr[start]=tmp;
			start++;
			end--;
		}
		
	}
}
