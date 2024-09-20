
public class StaticDemo5B 
{
   int a = funA();
	public static void main(String[] args) 
	{
	System.out.println("main method of StaticDemo5B");
	new StaticDemo5B();
	new StaticDemo5B();
	new StaticDemo5B();
	System.out.println("Done");

	}
	int funA()
	{
		System.out.println("funA of new StaticDemo5B");
		return 10;
	}

}
