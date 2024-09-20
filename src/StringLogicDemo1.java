
public class StringLogicDemo1 
{

	public static void main(String[] args) 
	{
	String s1 = "RBG technologies";
    int charcount = s1.length();
    System.out.println(charcount);
    char crr[] = s1.toCharArray();
    System.out.println(crr[0]);
    char c1 = s1.charAt(5);
    System.out.println(c1);
    String str1[] = s1.split(" ");
    System.out.println(str1[0]);
    System.out.println(str1[1]);
    String str2[] = s1.split("o");
    System.out.println(str2[0]);
    System.out.println(str2[1]);
    System.out.println(str2[2]);
    String subString1 = s1.substring(3);
    System.out.println(subString1);
    String subString2 = s1.substring(3,7);
    System.out.println(subString2);
    String replace1 = s1.replace("e","@");
    System.out.println(replace1);

	}

}
