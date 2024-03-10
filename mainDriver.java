//Question 1

package Task_4;
import java.util.Scanner;
public class mainDriver {
public static void main(String[] args) {
	//Creating the Object for Student Class
	Student S1 = new Student();
	// Try and Catch Block -> We have created 2 separate Try and Catch Block because the Error is found first line of Try block it found 
	// it wont see the next line eventhough the second line has also got  an error 
	
	try
	
	{
		S1.isvalidAge(S1.getAge());
	}
	catch(AgeNotWithinRangeException exp)
	{
		System.out.println("Something went wrong" + exp);
	}
	
	try // Try and Catch block VAlidname
	{
		S1.isvalidName(S1.getName());
	}
	catch(NameNotValidException e)
	{
		System.out.println("Something went wrong" + e);
	}
	finally
	{
		System.out.println("Thanks");
	}

}
}

/*OUTPUT*/

/*
Enter the Name
johN)#
Enter the rollNo
840
Enter the Age
25
Enter the Course
Java
Something went wrongTask_4.AgeNotWithinRangeException: Entered age is out of the range
Something went wrongTask_4.NameNotValidException: Entered Name is Invalid
Thanks
*/