package Day12;
import java.util.Scanner;

public class ValidatePin
{
	public static void main( String[] args )
	{
//taking input.............................................		
		Scanner sc = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF Harshita.");
		System.out.println("ENTER YOUR PIN: ");
		int entry = sc.nextInt();
 //checking for pin.................................................       
		while ( entry != pin )
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.println("ENTER YOUR PIN: ");
			entry = sc.nextInt();
		}
   
		System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}


