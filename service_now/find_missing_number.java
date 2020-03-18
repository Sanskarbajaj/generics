package service_now;

public class find_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,4,3,2,1};
		System.out.println(findmiss(a));

	}
/*	public static int findmiss(int []arr)
	{int ans=0,ans1=0;
	for(int x:arr)
	ans=ans+x;
	ans1=((arr.length+1)*(arr.length+2))/2; return ans1-ans;}}
*/
	
	public static int findmiss(int[] arr)
	{
		int x1=arr[0];
		int x2=1;
		for(int i=1;i<arr.length;i++)
		{
			x1=x1^arr[i];
		}
		for(int i=2;i<=arr.length+1;i++)
		{
			x2=x2^i;
		}
		return x2^x1;
	}
}