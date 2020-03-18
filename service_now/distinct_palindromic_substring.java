package service_now;

//import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Set;

public class distinct_palindromic_substring {

	public static void main(String[] args) {
	HashSet<String> ans=printsubstring("abaaa");
	System.out.println(ans);
	System.out.println(ans.size());
	}
	public static HashSet<String> printsubstring(String str)
	{
		HashSet<String> set=new HashSet<String>();
		int count=0;
		//ArrayList<String>ar=new ArrayList<>();
		for(int i=0;i<str.length();i++) 
		{
			for(int j=i+1;j<str.length()+1;j++)
			{
				
				if(ispalin(str.substring(i,j)))
				{
					//System.out.println(str.substring(i,j));
					set.add(str.substring(i,j));
				    //	count++;
					//System.out.println(count);
				}
			}
		}
	return set;}
	public static boolean ispalin(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev=rev+s.charAt(i);
		
		if(s.equals(rev))
			return true;
		
		return false;
	}

}
