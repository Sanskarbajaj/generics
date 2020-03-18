package service_now;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class max_occ_with_equal_probab {

	public static void main(String[] args) {
		int arr[] = {-1, 4, 9, 7, 7, 2, 7, 3, 0, 9, 6, 5, 7, 8, 9};
		max(arr);
	}
	public static void max(int arr[])
	{
/*	HashMap<Integer,Integer> hp=new HashMap<>();
	for(int i=0;i<arr.length;i++)
	{
		if(hp.containsKey(arr[i]))
		{
		      hp.put(arr[i],hp.get(arr[i]+1));
		}
		else
		{
			hp.put(arr[i],1);
		}
	}
	int maxc=Integer.MIN_VALUE;
	int maxe=Integer.MIN_VALUE;
	for(Map.Entry<Integer,Integer>ent:hp.entrySet())
	{
		if(ent.getValue()>maxc)
		{
			maxc=ent.getValue();
			maxe=ent.getKey();
		}
	}*/
		   HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>(); 

		    for (int i = 0; i < arr.length; i++) 

		        if(mp.containsKey(arr[i])) 

		        { 

		            mp.put(arr[i], mp.get(arr[i]) + 1); 

		        } 

		        else

		        { 

		            mp.put(arr[i], 1); 

		        } 

		  

		    int max_element = Integer.MIN_VALUE; // stores max occurring element 

		  

		    // stores count of max occurring element 

		    int max_so_far = Integer.MIN_VALUE; 

		  

		    // traverse each pair in map and find maximum 

		    // occurring element and its frequency 

		    for (Map.Entry<Integer, Integer> p : mp.entrySet())  

		    { 

		        if (p.getValue() > max_so_far) 

		        { 

		            max_so_far = p.getValue(); 

		            max_element = p.getKey(); 

		        } 

		    } 

	//System.out.println(max_so_far+"  "+max_element);
	 int r = (int) ((new Random().nextInt(max_so_far) % max_so_far) + 1); 
	for(int i=0;i<arr.length;i++)
	{ int count=0;
		if(arr[i]==max_element)
		{ count++;
		//System.out.print(arr[i]+"->"+i+"End");
	//	System.out.println();
		}
		if(count==r)
		{
			System.out.println(arr[i]+"->"+i);
			break;
		}
	}
		
	}

}
