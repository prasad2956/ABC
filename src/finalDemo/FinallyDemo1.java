package finalDemo;

public class FinallyDemo1 
{
	public static int a = 10;
	public static int b = 0;
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Exception block1 in invoking");
		}
		try
		{
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Exception block2 in invoking");
		}
		finally
		{
			System.out.println("finally block-1 is invoking");
		}
		try
		{
			System.out.println(a/b);
		}
		finally
		{
			System.out.println("finally block-2 is invoking");
		}
		System.out.println("done");
	}

}
