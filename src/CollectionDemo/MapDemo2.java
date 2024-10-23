package CollectionDemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo2 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new Hashtable<String,String>();	
		map.put("Name","RBG");
		map.put("Selenium","Java");
		map.put("API testing","PostMan");
		int size = map.size();
		System.out.println("size: "+size);
		map.put("Name","RBG");
		map.put("Selenium","Java");
		map.put("API testing","PostMan");
		map.put("API testing","RestAssured");
		size = map.size();
		System.out.println("size: "+size);

	}

}
