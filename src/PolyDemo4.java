
public class PolyDemo4 
{

	public static void main(String[] args) 
	{
		PolyDemo4 p1 = new PolyDemo4();
		p1.funA(10,true);
		p1.funA(true,20);

	}
   void funA(int a, boolean b)
   {
	   System.out.println("int boolean args of PolyDemo4");
   }
   void funA(boolean b,int a)
   {
	   System.out.println("boolean int args of PolyDemo4");
   }
}
