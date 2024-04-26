package CollectionFrameWork;
import java.util.ArrayList;

public class ReverseArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Mango");
		al.add("Banana");
		System.out.println("Given ArrayList :"+al );
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.print(al.get(i)+" ");
		}

		
	}

}
