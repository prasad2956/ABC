package exceptionDemo;

public class ExceptionDemo2 
{

	public static void main(String[] args) 
	{
		System.out.println("main method of ExceptionDemo2");
		try 
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is invoking");
		}

		System.out.println("Done");
	}

}
