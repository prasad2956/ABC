package Practice;

public class Practice6 
{

	public static void main(String[] args) 
	{
		String s1 = "{[('abc':'123')]},{[('def':'456')]},{[('ghi':'789')]}";
		String r1 = s1.replace("':'", "=");
		System.out.println(r1);	
		String r2 = r1.replace("{[('","");
		System.out.println(r2);
		String r3 = r2.replace("')]}","");
		System.out.println(r3);
		String s[]=r3.split(",");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
	}
}
