package CollectionFrameWork;

import java.util.Arrays;
import java.util.List;

public class ImmutableList {

	public static void main(String[] args) 
	{
		List<Integer> listOfNum = Arrays.asList(1,2,3,4,5,6,7,8);
		listOfNum.add(9); //java.lang.UnsupportedOperationException
		
		List<Integer> listOfNumbers = List.of(1,2,3,4,5,6,7);
		listOfNumbers.add(8); //java.lang.UnsupportedOperationException
	}
}