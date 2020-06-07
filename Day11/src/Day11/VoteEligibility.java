package Day11;
import java.util.*;
class InvalidAgeException extends Exception{
	
}
public class VoteEligibility  {

	public static void main(String[] args) {
		// Taking input.................
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		try {
			if(age>=18)
				System.out.println("welcome to voting");
			else
				throw new InvalidAgeException();
		}
		catch (InvalidAgeException e) {
			System.out.println("exception occured :"+e+" age not valid");
		}

	}

}
