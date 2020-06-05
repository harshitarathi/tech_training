package day10;
import java.util.*;

public class PrimeNumbers {
	public static boolean isPrime(int num)
	{
		boolean flag=true;
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0)  
				flag= false;
		}
		return flag;
	}
	//main function..........................................................
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number upto which you want to print prime number");
		int size=sc.nextInt();
		int num=2,count=0;
			for(int i=1;count<size;i++) {
			if(isPrime(num)) {
				System.out.println(num+" ");
				count++;
			}
			num++;
	}
}
}