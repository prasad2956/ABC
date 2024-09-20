
public class ThisDemo10 
{
	ThisDemo10()
	{
		this(20);
		System.out.println("zero args of ThisDemo10");
	}
	ThisDemo10(int a)
	{
		this();
		System.out.println("zero args of ThisDemo10");
		
	}
	
//this keyward can't called in the two functions at the same time
}
