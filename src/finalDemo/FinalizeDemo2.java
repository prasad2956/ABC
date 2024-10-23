package finalDemo;

public class FinalizeDemo2 
{

	public static void main(String[] args) 
	{
		FinalizeDemo2 f1 = new FinalizeDemo2();
		FinalizeDemo2 f2 = new FinalizeDemo2();
		FinalizeDemo2 f3 = new FinalizeDemo2();
		FinalizeDemo2 f4 = new FinalizeDemo2();
		FinalizeDemo2 f5 = new FinalizeDemo2();
        
		f1 = f5;
		f2 = f5;
		f3 = f5;
		f4 = f5;
		
		new FinalizeDemo2();
		new FinalizeDemo2();
		new FinalizeDemo2();
		new FinalizeDemo2();
		
		System.gc();
		System.out.println("Done");
	}
   public void finalize() throws InterruptedException 
   {
	 System.out.println("finalize of finalizeDemo2"); 
	 Thread.sleep(2);
   }
}
