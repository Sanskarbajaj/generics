package service_now;

public class segregate_no_of_zeros_and_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {0,1,1,0,0,1,1,1,0};
sorrt(arr);
		for(int x:arr)
		{
			System.out.println(x);
		}

	}
	public static void sorrt(int[]arr)
	{
		int l=0,r=arr.length-1;
	 while(l<r)
	 {
		 while(arr[l]==0&&l<r)
			 l++;
		 while(arr[r]==1&&l<r)
			 r--;
		 if(l<r)
		 {
			 arr[l]=0;
			 arr[r]=1;
			 l++;
			 r--;
		 }
	 }
	
	}

}
