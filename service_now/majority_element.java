package service_now;

import java.util.HashMap;
import java.util.Map;

public class majority_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 3, 4, 2, 4, 4, 2,4, 4};
		maj(arr);

	}
//	public static int maj(int[] arr)
//	{
//		int count=0;
//		for(int i=0;i<arr.length;i++)
//		{ count=0;
//			for(int j=i;j<arr.length;j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					//System.out.println(arr[i]);
//					count++;
//				}
//			}
//			if(count>(arr.length)/2)
//			{
//				System.out.println(arr[i]);
//				return arr[i];
//			}
//		}
//	return -1;}
	public static void maj(int[] arr)
	{
		HashMap<Integer,Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{	if(hm.containsKey(arr[i]))
		{
		      int neww=hm.get(arr[i]);
		      neww++;
		      hm.put(arr[i],neww);
		}
			else
			hm.put(arr[i],1);}
		int n=arr.length;
		//System.out.println(hm);
		for(Map.Entry<Integer,Integer> ent:hm.entrySet())
		{
			if(ent.getValue()>n/2)
			{
				System.out.println(ent.getKey());
			}
			else
			{
				//System.out.println("-1");
			}
		}
	}

}
