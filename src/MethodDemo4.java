
public class MethodDemo4 
{

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		funC();
		System.out.println("Done");

	}
   static  void funA()
   {
	   System.out.println("funA of MethodDemo4");
	   funC();
   }
   static  void funB()
   {
	   System.out.println("funB of MethodDemo4");
	   funA();
   }
   static  void funC()
   {
	   System.out.println("funC of MethodDemo4");
	   funB();
   }
}
