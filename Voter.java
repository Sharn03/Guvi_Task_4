//QUESTION 2

package Task_4;
//Creating a Class called Voter
public class Voter 
	{
	//Making the Data Member as Private in-order to avoid accessing data easily
	private int voterId;
	private String voterName;
	private int age;
	
	// Parameterized constructor which will throw an error if Age is below 18 by an User Defined Exception 
	public Voter(int voterId, String voterName, int age) throws InvalidAgeForVoterException
	
	{
		this.voterId = voterId;
		this.voterName = voterName;
		this.age = age;
		
		if(age < 18)
		{
			 // Creating an Exception if the input the above condition
			 throw new InvalidAgeForVoterException("Invalid Age for Voter");
		}
		else
		{
			System.out.println("Valid Age for Voting");
		}
		
	}
	
	// Getters and Setters method for Accessing the Data-Member in an enclosed  way
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
