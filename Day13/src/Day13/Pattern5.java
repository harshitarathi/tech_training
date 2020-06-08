package Day13;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// Taking input...................................
				Scanner sc=new Scanner(System.in);
				System.out.println("how many rows you want to print in your pyramid");
				int num=sc.nextInt();
				int i,j,k;
				//printing pyramid.............................
				for(i=num;i>0;i--) {
					for(j=num;j>num-i;j--) {
						System.out.print(j);
					}
					System.out.println();
				}

	}

}
