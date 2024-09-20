
public class ThisDemo9 
{
	ThisDemo9()
	{
		System.out.println("zero args of ThisDemo9");
	}
	ThisDemo9(int a)
	{
		System.out.println("zero args of ThisDemo9");
		this();  //compiletime error
	}
	//this keyward must be the first statement in the function

}
