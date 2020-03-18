package service_now;

import java.util.Stack;

public class sort_stack_wo_another_ds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stk=new Stack<>();
		stk.push(1);
		stk.push(5);
		stk.push(3);
		stk.push(4);
		stk.push(2);
		System.out.println("*********************");
		Stack<Integer> ans=sortstack(stk);
		System.out.println(ans.pop());
		System.out.println(ans.pop());
		System.out.println(ans.pop());
		System.out.println(ans.pop());
		System.out.println(ans.pop());
	}
	public static  Stack<Integer> sortstack(Stack<Integer> input)
	{	Stack<Integer> tempstack=new Stack<Integer>();
		while(!input.isEmpty())
		{
		int temp=input.pop();
		while(!tempstack.isEmpty()&&tempstack.peek()>temp)
		{
			input.push(tempstack.pop());
		}
		tempstack.push(temp);
		}
	return tempstack;}
}
