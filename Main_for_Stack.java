//QUESTION - 5

//Stack Data Structure is a concept of "First in and Last out"
package Task_4;
public class Main_for_Stack {
public static void main(String[] args) {
	//Here we are creating the Object for the StackDemo 
	Stack_Demo S1 = new Stack_Demo();
	
	// Creating  Push method in Stack_Demo for the pushing the data into the stack
	S1.push("Raina");
	S1.push("Dhoni");
	S1.push("Pant");
	S1.push("Hardik");
	S1.push("Kohli");
	
	// Here, we have tried to handle the exception when we tried to pop it more the the array length
	for(int i = 0;i<=S1.arrlength();i++)
	{
		try
		{
			System.out.println(S1.pop());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Something went Wrong" + e);
		}
	}
	
}
}
