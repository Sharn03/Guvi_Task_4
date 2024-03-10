package Task_4;
import java.util.*;
//Creating Class Demo 
class Demo
{
	// Declaring Hashmap
	private HashMap<String,Integer>hmap;
	
	//Creating the non-Paramaterized Constructor for initialising the hashmap
	Demo()
	{
		hmap = new HashMap<>();
	}
	//Creating Add method for adding the data into the hashmap
	public void add (String Name,int Grade)
	{
		hmap.put(Name, Grade);
		System.out.println(Name+" "+"Added to HashMap");
	}
	//Remove method to remove key 
	public void remove(String Name,int Grade)
	{
		//hmap.remove(Name);
		hmap.remove(Name,Grade);
		System.out.println(Name +" "+"Removed Successfully");
	}
	//Display show that value of Key
	public void display(String Name)
	{
		//ContainKey method check where the KEy is available in the map
		if(hmap.containsKey(Name))
		{
			System.out.println(Name + " "+ hmap.get(Name));
		}
		else
		{
			System.out.println("Student Not Found");
		}
		
	}
	
}
//Main Driver class from where we can access the above class
public class storing_NameandGrades_Hashmaps 
{
	 HashMap<String,Integer>hmap = new HashMap<>();

public static void main(String[] args) 
	{
	
	Demo S1 = new Demo();
	//Adding the Key, Value to the hashMap
	S1.add("Suresh",100);
	S1.add("Shwe",200);
	S1.add("Saravana",300);
	
	//Removing the Key and the value
	S1.remove("Shwe",200);
	// Displaying the grades of the KEy 
	S1.display("Saravana");
	S1.display("Shwe");
	}

}

/*OUTPUT
 
Suresh Added to HashMap
Shwe Added to HashMap
Saravana Added to HashMap
Shwe Removed Successfully
Saravana 300
Student Not Found


 */



