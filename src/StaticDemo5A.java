
public class StaticDemo5A 
{
   int a = funA();
   static int b = funB();
	public static void main(String[] args) 
	{
	System.out.println("main method of StaticDemo5A");
	System.out.println(b);
	StaticDemo5A s1 = new StaticDemo5A();
	System.out.println(s1.a);
	s1.funA();
	System.out.println("done");

	}
   int funA()
   {
	   System.out.println("funA of StaticDemo5A");
	   return 10;
   }
   static int funB()
   {
	   System.out.println("funB of StaticDemo5A");
	   return 20;
   }

}
