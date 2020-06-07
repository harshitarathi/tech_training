package Day11;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// Taking input...................................
		Scanner sc=new Scanner(System.in);
		System.out.println("how many rows you want to print in your pyramid");
		int num=sc.nextInt();
		int i,j,k;
		//printing pyramid.............................
		for(i=0;i<num;i++) {
			for(j=1;j<=i;j++) {
					System.out.print(" ");
			}

				for(j=1;j<=num-i;j++) {
						System.out.print(j);
				}
				for(k=num-1-i;k>=1;k--) {
					System.out.print(k);
			}
			System.out.println();
			
		}
			
		}

	}

