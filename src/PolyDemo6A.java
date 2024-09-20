
public class PolyDemo6A
{

	public static void main(String[] args) 
	{
		PolyDemo6A p1 = new PolyDemo6A();
		A m = null;
		p1.funA(m);
        B n = null;
        p1.funA(n);
        C o = null;
        p1.funA(o);
	}
	 void funA(A a) 
	   {
		 System.out.println("class A args of PolyDemo6"); 
		 System.out.println(a);
	   }
	   void funA(B b) 
	   {
		 System.out.println("class B args of PolyDemo6"); 
		 System.out.println(b);
	   }
	   void funA(C c) 
	   {
		 System.out.println("class C args of PolyDemo6"); 
		 System.out.println(c);
	   }
}
