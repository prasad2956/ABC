
public class ThisDemo9A 
{
	ThisDemo9A()
	{
		System.out.println("zero args of ThisDemo9A");
		this(20);  //compiletime error
	}
	ThisDemo9A(int a)
	{
		System.out.println("int args of ThisDemo9A");
	}
	

}
