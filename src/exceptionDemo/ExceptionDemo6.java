package exceptionDemo;

public class ExceptionDemo6 
{
  static A a1;
	public static void main(String[] args) 
	{
		System.out.println("main method of ExceptionDemo5");
		try 
		{
			System.out.println(10/2);
			int arr[] = {10,20,30,40,50};
			System.out.println(arr[4]);
			System.out.println(ExceptionDemo6.a1.i);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException is invoking");
		}
		catch(ArrayIndexOutOfBoundsException f )
		{
			System.out.println("ArrayIndexOutOfBoundsException is invoking");
		}
		catch(NullPointerException g)
		{
			System.out.println("NullPointerException is invoking");
		}

		System.out.println("Done");
	}

}
