//QUESTION 2

package Task_4;

public class Main_Voter {
public static void main(String[] args) {
	
	// Declared the Try and Catch Block for Handling the exception
	try 
	{
	Voter v1 = new Voter(111,"Sharan",20);
	
	}
	catch(InvalidAgeForVoterException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Thanks for your Voting Eligibility Test");
	}
}
}
