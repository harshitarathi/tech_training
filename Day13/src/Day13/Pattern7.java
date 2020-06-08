package Day13;

import java.util.Scanner;

public class Pattern7 {

		public static void main(String[] args) {
			// Taking input...................................
			Scanner sc=new Scanner(System.in);
			System.out.println("how many rows you want to print in your pyramid");
			int num=sc.nextInt();
			int i,j,k;
			//printing pyramid.............................
			for(i=num;i>=1;i--) {
				for(j=1;j<=i;j++) {
						System.out.print(j);
				}if(i!=num)
							System.out.print(" ");
						for(k=i;k>=1;k--)
				System.out.print(k);
				
			System.out.println();
			}	
			}

	}


