package Day11;
import java.util.*;

public class DivisionProgram {

	public static void main(String[] args) {
		//taking input..................
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dividend");
		int num1=sc.nextInt();
		System.out.println("enter divisor");
		int num2=sc.nextInt();
		
		try {
			if(num2==0)
				throw new ArithmeticException();
			else
				System.out.println("the quotient is "+num1/num2);
		}
		catch(ArithmeticException e) {
			System.out.println("divided by zero exception");
		}
		
		

	}

}
