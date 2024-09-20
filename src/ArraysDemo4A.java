
public class ArraysDemo4A 
{

	public static void main(String[] args) 
	{
		A k = new A();
		A arr[] = new A[5];
		arr[0] = new A();
		arr[1] = new A();
		arr[2] = k;
		arr[4] = new A();
		k.i=9;
		System.out.println(arr[2].i);
	}

}
