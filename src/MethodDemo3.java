
public class MethodDemo3 
{

	public static void main(String[] args) 
	{
	System.out.println("main method of MethodDemo3");
    funB();
    System.out.println("Done");
	}
  static void funA()
  {
	  System.out.println("funA of MethodDemo3");
  }
  static void funB()
  {
	  System.out.println("funB of MethodDemo3");
	  funA();
  }
}
