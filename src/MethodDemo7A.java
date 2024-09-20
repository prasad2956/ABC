
public class MethodDemo7A 
{

	public static void main(String[] args) 
	{
	System.out.println("main method of MethodDemo7");
	MethodDemo7A  m1 = new  MethodDemo7A();
	m1.funB();
	System.out.println("Done");

	}
   void funA() 
   {
	 System.out.println("funA of MethodDemo7");  
   }
   void funB() 
   {
	 System.out.println("funB of MethodDemo7");
		funA();
		this.funA();
   }
}
