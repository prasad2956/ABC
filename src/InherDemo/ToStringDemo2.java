package InherDemo;

public class ToStringDemo2 
{
    int a = 10;
    String s1 = "RBG technologies";
    
	public static void main(String[] args) 
	{
	System.out.println("main mathod starts");	
	ToStringDemo2 t1 = new ToStringDemo2();
	System.out.println(t1);
	System.out.println("Done");
	}
   public String toString()
   {
	  System.out.println("ToStringDemo1 of ToStringDemo1");
	  
	  return s1+" "+a;
	  
   }
}
