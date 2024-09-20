package absDemo;

public abstract class AbsDemo5 
{
	AbsDemo5()
	{
		System.out.println("cons of AbsDemo5");
	}
	public static void main(String[] args) 
	{
		AbsDemo5 s1 = new AbsDemo5();
       s1.funC();
	}
	abstract void funA();
	abstract void funB();
	void funC()
	{
		System.out.println("funC of absDemo5");
	}
}
