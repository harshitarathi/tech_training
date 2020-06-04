package day9;
import java.util.*;

public class Series {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of series");
		int num=sc.nextInt();
		int i;
		System.out.println("The series is");
		for(i=1;i<=num;i++) {
			System.out.print(Math.pow(i,3)+" , " );
		}
	}

}
