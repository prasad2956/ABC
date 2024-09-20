
public class Odemo2B
{
	  int x,y;
	  void fun1()
	  {
		  x=x+1;
		  Odemo2 d1 = new  Odemo2(); 
		  d1.x=x+2;
		  System.out.println(d1.x);
	  }

	public static void main(String[] args) 
	{
		Odemo2B d1 = new Odemo2B();
		d1.fun1();
		System.out.println(d1.x);

	}
}
