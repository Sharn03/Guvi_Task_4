//QUESTION - 5

package Task_4;
public class Stack_Demo {
	//Declaring the array and Index
	private String arr[];
	private int arrIndex;
	//Constructor for Stack_Demo
	Stack_Demo()
	{
		this.arr = new String[5];
		this.arrIndex = 0;
	}
	
	//Method for the getting he array length
	public int arrlength()
	{
		return arr.length;
	}
	
	//Push Method for pushing the data into the array
	public void push(String Name)
	{
		if(arrIndex>arr.length-1)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			arr[arrIndex++] = Name;
		}
	}
	
	//Pop method for the getting the data from the stack 
	// In stack data structure -> the data will poped from last index
	public String pop()
	{
		if(arrIndex<0)
		{
			System.out.println("Stack Index is Empty");
		}
		
		return arr[--arrIndex];
	}
}
