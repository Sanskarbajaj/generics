package service_now;

public class bitonicarraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {-3, 9, 8, 20, 17, 5, 1};
        int key = 20;
        System.out.println(bts(arr,key));

	}
	public static int bts(int arr[],int key)
	{
		int lo=0,hi=arr.length-1;
		while(lo<=hi)
		{
		int mid=(lo+hi)/2;
		if(arr[mid]==key)
		{
			return mid;
		}
		else if(arr[mid]>key)
		{
			hi=mid-1;
		}
		else if(arr[mid]<key)
		{
			lo=mid+1;
		}
		}
	return -1;}

}
