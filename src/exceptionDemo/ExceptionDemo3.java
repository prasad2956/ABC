package exceptionDemo;

public class ExceptionDemo3 
{

	public static void main(String[] args) 
	{
		System.out.println("main method of ExceptionDemo3");
		try 
		{
			System.out.println(10/2);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is invoking");
		}

		System.out.println("Done");
	}

}
