package day9;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new  Scanner(System.in);
		System.out.println("enter the year");
		int year=sc.nextInt();
		if(year%4==0)
			System.out.println("the year "+year+" is leap year.");
		else
			System.out.println("the year "+year+" is not a leap year.");
			
		

	}

}
