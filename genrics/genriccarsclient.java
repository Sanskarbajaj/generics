package genrics;

public class genriccarsclient {

	public static void main(String[] args) {
		genriccars[] cars=new genriccars[5];
		cars[0]=new genriccars(10, 100,"yellow");
		cars[1]=new genriccars(120, 10055,"blue");
		cars[2]=new genriccars(102, 1005,"red");
		cars[3]=new genriccars(210, 1020,"white");
		cars[4]=new genriccars(20, 020,"te");
		bubblesort(cars);
		
		for(int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		}
	
		public static <T extends Comparable<T>>void bubblesort(T[] cars)
		{
		
			for(int i=0;i<cars.length;i++)
			{
				for(int j=0;j<cars.length-1;j++)
				{
					if(cars[j].compareTo(cars[j+1])>0)
					{
						T temp=cars[j];
						cars[j]=cars[j+1];
						cars[j+1]=temp;
					}
					
				}
			}
	}

}
