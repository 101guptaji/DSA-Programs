import java.util.*;
public class Array1 {
	public static void main(String[] args){
		int[] arr = new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=i;
		}
		squre(arr);
		
		int[][] mat=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				System.out.printf("Enter valur for arr[%d][%d] ",i,j);
				mat[i][j]=sc.nextInt();
			}
		}
		sc.close();
		sumrows(mat);
		
	}

	private static void sumrows(int[][] mat) {
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void squre(int[] arr) {
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]*i);
		}
		
	}

}

