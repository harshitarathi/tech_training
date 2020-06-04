package day9;
import java.util.*;
import java.math.*;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to check for armstrong");
		int num=sc.nextInt();
		int num1,temp;
		double sum=0;
		num1=num;
		//calculating for armstrong number
		while(num!=0) {
			temp=num%10;
			sum=sum+ Math.pow(temp,3);
			num=num/10;
			
		}
		//checking for euality
		if(num1==sum)
			System.out.println("the number is armstrong number");
		else
			System.out.println("not an armstrong number");
	}

}
