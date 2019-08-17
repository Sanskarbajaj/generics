package genrics;

public class basicgenricdisplayfn {
	
	
	

	public static void main(String[] args) {
		Integer[] arri= {1,2,3,4,5};
		String[] arrs= {"hey","yo","boi","cancer"};
		genriccars[] cars=new genriccars[5];
		cars[0]=new genriccars(10, 100,"yellow");
		cars[1]=new genriccars(120, 10055,"blue");
		cars[2]=new genriccars(102, 1005,"red");
		cars[3]=new genriccars(210, 1020,"white");
		cars[4]=new genriccars(150, 1002,"pink");
		display(cars);
		

	}
//	public static void display(int[] arr)    // we have to make 2 fns and have to do fn overloading for doing display 
//	{                                        // we have to make n number of function if we have n types of data like char, cars ,student
//		for(int val:arr)                     //this thing will work well but have to make a lot of fns for this 
//		{                                    //********so we will make genric display here which can work for any type of data********
//			System.out.print(val+"->");
//		}
//		System.out.println();
//	}
//	public static void display(String[] arr)
//	{
//		for(String val:arr)
//		{
//			System.out.print(val+"->");
//		}
//		System.out.println();
//	}
	//*************Generic display**************//
	
	public static  <T>void display(T[] arr)
	{
		for(T val:arr)                     //this thing will work well but have to make a lot of fns for this 
		{                                    //********so we will make generic display here which can work for any type of data********
			System.out.println(val+"->");
		}
		System.out.println();
	}

}
