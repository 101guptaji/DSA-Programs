
//Array Rotation left by using A Juggling Algorithm(gcd of n and d)
//Time complexity : O(n) 
//Auxiliary Space : O(1)

public class ArrayRotat3 {
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12};
		int n=arr.length;
		int d=3;
		int tmp,k;
		int gcd=getGCD(d,n);
		for(int j=0;j<gcd;j++)
		{
			tmp=arr[j];
			int i=j;
			while(true)
			{
				k=i+d;
				if(k>=n)
					k=k-n;
				if(k==j)
					break;
				arr[i]=arr[k];
				i=k;
			}
			arr[i]=tmp;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static int getGCD(int a, int b) {
		if(b==0)
			return a;
		else
			return getGCD(b,a%b);
	
	}
}
