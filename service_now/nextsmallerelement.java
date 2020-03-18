package service_now;

import java.util.Stack;

public class nextsmallerelement {

	public static void main(String[] args) {
		int arr[]= {4,8,5,2,25};
		nse(arr);
	}
	public static void nse(int[] arr)
	{
		Stack<Integer> stk=new Stack<>();
		stk.push(arr[0]);
		for(int i=1;i<arr.length;i++)
		{
			if(stk.isEmpty())
			{
				stk.push(arr[i]);
			}
			
			while(!stk.isEmpty()&&stk.peek()>arr[i])
			{
				System.out.println(stk.pop()+"->"+arr[i]);
			}
			stk.push(arr[i]);
		}
		while(!stk.isEmpty())
		{
		   System.out.println(stk.pop()+"->"+"-1");
		}
		
	}

}
