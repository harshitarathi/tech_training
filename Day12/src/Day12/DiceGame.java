package Day12;
import java.util.*;

public class DiceGame {

	public static void main(String[] args) {
		Random r1=new Random();
		System.out.println("Roll Dice :");
		int num1=r1.nextInt(6);
		System.out.println("Number is :"+num1);
		Random r2=new Random();
		System.out.println("Roll Dice again:");
		int num2=r2.nextInt(6);
		System.out.println("Number is :"+num2);

		if(num1%2==0 && num2%2==0)
			System.out.println("Points="+(num1+num2));
		else
		{
			if(num1>num2)
				System.out.println("Points="+(num1-num2));
			else
				System.out.println("Points="+(num2-num1));
		}
	}
}
