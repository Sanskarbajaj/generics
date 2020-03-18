package service_now;

public class spiral_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		spiral(arr, 3, 3);

	}
	public static void spiral(int arr[][],int m,int n)
	{
		int k=0,l=0,lr=m-1,lc=n-1;
		while(k<=lr&&l<=lc)
		{
		for(int i=k;i<=lc;i++)
		{
			System.out.print(arr[k][i]+" ");
		}
		k++;
		for(int j=k;j<=lr;j++)
		{
			System.out.print(arr[j][lc]+" ");
		}
		lc--;
		//if(k<=lr)
		//{
			for(int i=lc;i>=l;i--)
			{
				System.out.print(arr[lr][i]+" ");
			}
			lr--;
		//}
		//if(l<=lc)
		//{
		for(int i=lr;i>=k;i--)
		{
			System.out.print(arr[i][l]+" ");
		}
		l++;
	//	}
	}
	}

}
