//QUESTION 3

package Task_4;
import java.lang.Exception;
//import java.nio.channels.AlreadyBoundException;

public class Weekdays {
public static void main(String[] args) {
	String arr[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	try {
		System.out.println(arr[10]);
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Something went Wrong" + "\n"+ e);
	}
	finally
	{
		System.out.println("Error has been Handled");
	}
}
}
/*OUTPUT
 
Something went Wrong
java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 7
Error has been Handled

*/

