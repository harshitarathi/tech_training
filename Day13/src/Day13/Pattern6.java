package Day13;

import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		// Taking input...................................
		Scanner sc=new Scanner(System.in);
		System.out.println("how many rows you want to print in your pyramid");
		int num=sc.nextInt();
		int i,j,k;
		//printing pyramid.............................
		for(i=1;i<=num;i++) {
			for(j=1;j<=i;j++) {
					System.out.print(j);
			}
			System.out.println();
		}
		for(i=num-1;i>=1;i--) {
			for(j=1;j<=i;j++) {
					System.out.print(j);
			}
			System.out.println();
			
			
		}
}
}