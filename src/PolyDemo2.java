
public class PolyDemo2 
{

	public static void main(String[] args) 
	{
		PolyDemo2 d1 = new PolyDemo2();
		d1.funA();
		d1.funA(10);
		d1.funA(50l);
		d1.funA(10.23f);
		d1.funA(20.56);
		

	}
   void funA()
   {
	   System.out.println("zero args of funA");
   }
   void funA(int a)
   {
	   System.out.println("int args of funA");
   }
   void funA(long b)
   {
	   System.out.println("long args of funA");
   }
   void funA(float c)
   {
	   System.out.println("float args of funA");
   }
   void funA(double d)
   {
	   System.out.println("double args of funA");
   }
   
}
