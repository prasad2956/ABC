
public class WrapperClassDemo1 
{

	public static void main(String[] args) 
	{
		int a = 10;
		Integer i1 = new Integer(a);//Boxing
		int b = i1.intValue();//un-Boxing
		System.out.println(b);
		
		Integer i2 = 20; //Auto - Boxing
		int c = i2; // Auto - unBoxing
		System.out.println(c);
				
		

	}

}
