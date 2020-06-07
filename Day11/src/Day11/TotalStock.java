package Day11;
import java.util.*;
public class TotalStock {

	public static void main(String[] args) {
		// taking input...............................
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of products");
		int size=sc.nextInt();
		System.out.println("Enter number of available products");
		int[] product=new int[100];
		int i,sum=0;
		//adding total products...........................
		for(i=1;i<=size;i++) {
			product[i]=sc.nextInt();
			sum+=product[i];
		}
		System.out.println("total number of product in stock is : "+sum);
	}

}
