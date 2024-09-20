
public class PolyDemo6
{

	public static void main(String[] args) 
	{
		PolyDemo6 p1 = new PolyDemo6(); 
		A n = new A();
		B m = new B();
		C d = new C();
		p1.funA(n);
		p1.funA(m);
		p1.funA(d);
		p1.funA(new A());
		p1.funA(new B());
		p1.funA(new C());

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
