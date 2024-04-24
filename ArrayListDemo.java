package CollectionFrameWork;

import java.util.*;
public class ArrayListDemo
{
	public static void main(String... a)
	{
		ArrayList<String> arl = new ArrayList<>();//Generic type		
		arl.add("Apple");   
		arl.add("Orange");
		arl.add("Grapes");
		arl.add("Mango");
		arl.add("Guava");
		arl.add("Mango");

		System.out.println("Contents :"+arl); //toString()  [Apple,....]

		arl.remove(2); //based on the index position [List]
		arl.remove("Guava"); //based on the Object [Collection]

		System.out.println("Contents After Removing :"+arl);
		System.out.println("Size of the ArrayList:"+arl.size());

		Collections.sort(arl); 
		
	    arl.forEach(System.out::println);	
	}
}