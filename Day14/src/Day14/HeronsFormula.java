package Day14;
import java.util.*;
import java.math.*;

public class HeronsFormula{
	public static void main( String[] args ){

		double s, Ar;
		System.out.println("Enter the 3 sides of a triangle as integer:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		s = (a+b+c) / 2;
		Ar = Math.sqrt( s*(s-a)*(s-b)*(s-c) );
		System.out.println("Area of Tringle is "+Ar);

}
}

