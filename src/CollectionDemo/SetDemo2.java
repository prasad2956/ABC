package CollectionDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 
{

	public static void main(String[] args) 
	{
		Set<String> set = new HashSet<String>();
		set.add("RBG technologies");
		set.add("Java");
		set.add("Selenium");
		int size = set.size();
		System.out.println("size: "+size);
		set.add("RBG technologies");
		set.add("Java");
		set.add("API testing");
		size = set.size();
		System.out.println("size: "+size);
	}

}