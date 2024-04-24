//Serialization and De-serialization on ArrayList Object
package CollectionFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListDemo4
{  
  public static void main(String [] args) throws IOException, Exception 
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("B.Tech");
    al.add("M.Tech");
    al.add("BCA");
    al.add("MCA");
    al.add("BE");
    al.add("B.Pharma");
    
    var fos = new FileOutputStream("C:\\Batch28\\Course.txt");
    var oos = new ObjectOutputStream(fos);
    
    try(fos; oos)
    {
    	oos.writeObject(al);
    	System.out.println("Object Stored Successfully");
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
    
    
    var fin = new FileInputStream("C:\\Batch28\\Course.txt");
    var ois = new ObjectInputStream(fin);
    
    try(ois;fin)
    {
    	@SuppressWarnings("unchecked")
		ArrayList<String> arl =(ArrayList<String>)ois.readObject();        
        System.out.println(arl);
    }
    
    
  }
       
}    
