
public class PolyDemo1A 
{

	public static void main(String[] args) 
	{
	  funA();
	  funA(10);
	  funA(20l);
	  funA(10.23f);
	  funA(20.56);
	  funA('m');
	  funA(true);

	}
  static void funA()
  {
	System.out.println("zero args of PolyDemo1A");  
  }
  static void funA(int a)
  {
	System.out.println("int args of PolyDemo1A");  
  }
  static void funA(long b)
  {
	System.out.println("long args of PolyDemo1A");  
  }
  static void funA(float c)
  {
	System.out.println("float args of PolyDemo1A");  
  }
  static void funA(double d)
  {
	System.out.println("double args of PolyDemo1A");  
  }
  static void funA(char e)
  {
	System.out.println("char args of PolyDemo1A");  
  }
  static void funA(boolean f)
  {
	System.out.println("boolean args of PolyDemo1A");  
  }
}
