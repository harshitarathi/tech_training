package day10;
import java.util.*;

public class MaxQuantity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		//taking input..........................................................
		System.out.println("enter the total number of products");
		int num=sc.nextInt();
		int[] product=new int[10];
		int i;
		System.out.println("enter the quantity of products");
		for(i=1;i<=num;i++)
		product[i]=sc.nextInt();
		
		//checking for maximum...................................
		int max=product[0];
		for(i=1;i<=num;i++) {
			if(product[i]>max)
				max=product[i];
		}
		System.out.println("maximum quntity is"+max);
	}

}
