
public class ThisDemo8 
{

	public static void main(String[] args) 
	{
		System.out.println(this);  //compiletime erro

	}
   static void funA()
   {
	   System.out.println(this);   //compiletime erro
   }
   static
   {
	   System.out.println(this);   //compiletime erro
   }
}
