package service_now;

import java.util.HashMap;
import java.util.Map;

public class union_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 4, 5, 7};
        int brr[] = {2, 3, 5, 6}; 
        unint(arr, brr);

	}
public static void unint(int arr[],int brr[])
{
	HashMap<Integer,Boolean> hm=new HashMap<>();
	//HashMap<Integer,Boolean> hmm=new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
		hm.put(arr[i],false);
	}
	//System.out.println(hm);
	
	for(int i=0;i<brr.length;i++)
	{
	boolean ans= hm.containsKey(brr[i]);
	//System.out.println(ans);
	  if(ans)
	  {
		  hm.put(brr[i],true);
	  }else
	  {
		  
	  }
	}
	for(Map.Entry<Integer,Boolean> x:hm.entrySet())
	{
		if(x.getValue())
		{
			System.out.println(x.getKey());
		}
	}
	
}
}
