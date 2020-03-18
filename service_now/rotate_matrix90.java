package service_now;

public class rotate_matrix90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int brr[][]= {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
System.out.println("**************************");	
		for(int i=0;i<4;i++)
		{
			for(int j=3;j>=0;j--)
			{
				brr[i][j]=arr[j][i];
				System.out.print(brr[i][j]+" ");
				
			}
			System.out.println();
		}
//		System.out.println("************************");
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0;j<3;j++)
//			{
//				System.out.print(brr[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("*******************");
		for(int i=3;i>=0;i--)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(brr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
