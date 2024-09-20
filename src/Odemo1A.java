
public class Odemo1A 
{
	int x;
	int y;
    void fun1()
    {
    	x = x+1;
    	A a1 = new A();
    	a1.i = 9;
    
    }
    
	public static void main(String[] args)
	{
		Odemo1A d1 = new Odemo1A();
		d1.fun1();
		A a1 = new A();
		System.out.println(a1.i);
	}

}
