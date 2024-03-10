//Question 1
package Task_4;
import java.util.Scanner;
//Creating the Student and Declaring the data member of the Class
public class Student  {
	// We are keeping the data member as private so that one can access it directly from outside of the class
	// They can only Access it via Getter and Seters Methods
    private String name;
	private int rollNo;
	private int age;
	private String course;
	Scanner s = new Scanner(System.in);
	
	public Student()// creating a unparamaterized constructor for Student Class where we can make the get the inputs from the user
	                // that would give an user-interaction thing
	{
		System.out.println("Enter the Name");
	    this.name = s.next();
		System.out.println("Enter the rollNo");
		this.rollNo = s.nextInt();
		System.out.println("Enter the Age");
		this.age = s.nextInt();
		System.out.println("Enter the Course");
		this.course = s.next();
	}
	// Created the Getter and Setters method for the Accessing the Datamembers
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	//Here, We are Declaring isValidAge() as Exception as it throw an error if the User enter the Invalid Age
	public void isvalidAge(int age) throws AgeNotWithinRangeException
	{
		if(age >= 15 && age <=21  )
		{
			System.out.println("Valid Age");
		}
		else
		{
			// With new Keyword we are creating the UserDefinded EXception and we are also giving the comment for it
			throw new AgeNotWithinRangeException("Entered age is out of the range");
		}
	}
	
	//Here, We are Declaring isValidName() as Exception as it throw an error if the User enter the Invalid Name
	public void isvalidName(String name) throws NameNotValidException
	{
			//CAlling the has_specialCharacter() in order check whether the given string has any SpecialCharacter or Not
			if(has_specialCharacter(name))
			{
				// With new Keyword we are creating the UserDefinded EXception and we are also giving the comment for it
				throw new NameNotValidException("Entered Name is Invalid");
			}
			else
			{
				System.out.println("Valid Name");
			}
	
	}
	
	//This method is created for the purpose of Chechking the whether Name has any Special Characters or Digits in it
	// if Anything is found we should throw error.
	public boolean has_specialCharacter(String name)
	{
		for(int i = 0;i<name.length();i++)
		{
			char c =  name.charAt(i);
			if(Character.isLetterOrDigit(c))
			{
				return true;
			}
		
		}
		return false;
	}
}
