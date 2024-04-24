//Program to fetch the elements in forward and backward 
//direction using ListIterator interface

package CollectionFrameWork;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo3   
{                             
public static void main(String args[])
  {
	 List<String> listOfName = Arrays.asList("Rohit","Akshar","Pallavi","Sweta"); 
	 
	 Collections.sort(listOfName);
	 
	 //Fetching the data in both the direction
	 ListIterator<String> lst = listOfName.listIterator();
	 
	 System.out.println("In Forward Direction..");	 
	 while(lst.hasNext())
	 {
		System.out.println(lst.next()); 
	 }
	 System.out.println("In Backward Direction..");	 
	 while(lst.hasPrevious())
	 {
		System.out.println(lst.previous()); 
	 }
	 
  }
}