package service_now;

public class longest_increasing_subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,22,9,33,21,50,41,60,80};
		System.out.println(lis(arr));

	}
	public static int lis(int[] arr)
	{
		int []lis=new int[arr.length];
		int ans[]=new int[lis.length];
		for(int k=0;k<lis.length;k++)
		{
		ans[k]=1;
			lis[k]=1;
		}
		for(int i=1;i<arr.length;i++)
		{
			int j=0;
			while(j<i)
			{
				if(arr[j]<arr[i]&&lis[i]<lis[j]+1)
				{
					lis[i]=lis[j]+1;
					ans[i]=j;
				}
				j++;
			}
		}
		int max=0;
		int mi=0;
		for(int i=0;i<lis.length;i++)
		{
			System.out.print(ans[i]+"->");
			if(max<lis[i])
			{
				max=lis[i];
				mi=i;
			}
		}
		System.out.println();
	return mi;
	}

}
