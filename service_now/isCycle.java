package service_now;

public class isCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"ABC","CDE","EFG","GH"};
System.out.println(iscycle(arr));
	}
public static boolean iscycle(String arr[])
{
	boolean flag=false;
	for(int i=0;i<arr.length-1;i++)
	{
		//System.out.println(arr[0].charAt(0));
		//System.out.println(arr[arr.length-1].charAt(arr.length-1));
	//	if(arr[0].charAt(0)!=arr[arr.length-1].charAt(arr.length-1))
	//	{
	//		return false;
	//	}
		if(arr[i].charAt(arr[i].length()-1)==arr[i+1].charAt(0))
		{  
			//if(arr[0].charAt(0)!=arr[arr.length-1].charAt(arr.length-1))
			  flag =true;
			}
		else
		{
			flag=false;
			}
	}
 return flag;}
}
