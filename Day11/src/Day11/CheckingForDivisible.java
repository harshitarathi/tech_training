package Day11;
import java.util.*;
public class CheckingForDivisible {

	public static void main(String[] args) {
		//taking input....................................
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for divisible by 8 and 3");
		int num=sc.nextInt();
		//checking for divisibility.................
		if((num%3==0) && (num%8==0))
			System.out.println("divisible by both 8 and 3");
		else
			System.out.println("not divisible by 3 and 8");
		

	}

}
