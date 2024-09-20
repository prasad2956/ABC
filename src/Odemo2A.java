
public class Odemo2A 
{
	  int x,y;
	  void fun1()
	  {
		  x=x+1;
		  Odemo2 d1 = new  Odemo2(); 
		  d1.x=x+2;
	  }

	public static void main(String[] args) 
	{
		Odemo2A d2 = new Odemo2A();
		d2.fun1();
		System.out.println(d2.x);

	}
}
