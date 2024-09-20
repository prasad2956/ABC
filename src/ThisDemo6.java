
public class ThisDemo6 
{
	ThisDemo6()
	{
		this(20);
		System.out.println("zero args of ThisDemo6");
	}
	ThisDemo6(int a)
	{
		System.out.println("int args of ThisDemo6");
	}
	public static void main(String[] args) 
	{
	System.out.println("main method start");
	ThisDemo6 t1 = new ThisDemo6();
	System.out.println("Done");

	}

}
