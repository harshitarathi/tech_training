package Day12;
import java.util.*;

public class RandomClass {

	public static void main(String[] args) {
		// generating two random umbers................................
		Random r=new Random();
		int num1=r.nextInt(10);
		int num2=r.nextInt(10);
		System.out.println("first random number is= "+num1);
		System.out.println("second random number is= "+num2);
	//checking for equal.................
		if(num1==num2)
			System.out.println("random numbers are same");
		else
			System.out.println("random numbers are different");

	}

}
