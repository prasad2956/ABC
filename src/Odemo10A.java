
public class Odemo10A 
{

	public static void main(String[] args) 
	{
		Odemo10A d1 = new Odemo10A();
		Ramesh x = d1.funC();
		System.out.println(x);

	}
  int funA()
  {
	  return 10;
  }
  boolean funB()
  {
	  return true;
  }
  Ramesh funC()
  {
	  Ramesh r1 = new Ramesh();
	  return r1;
  }
}
