
public class XYZTest2 
{

	public static void main(String[] args) 
	{
		X x1 =  new X();
		//	X x2 = x1.funX();
		Y y1 = x1.funX();
		Z z1 = x1.funX().funY();
		Z z2 = x1.funX().funY().funZ();
		int z3 = x1.funX().funY().funZ().funB();
		Z z4 = x1.funX().funY().funZ().funZ();
		x1.funX().funY().funZ().funA();
	}

}
