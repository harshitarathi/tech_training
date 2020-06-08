package Day13;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// Taking input...................................
				Scanner sc=new Scanner(System.in);
				System.out.println("how many rows you want to print in your pyramid");
				int num=sc.nextInt();
				int i,j,k,k1;
				//printing pyramid.............................
				for(i=1;i<=num;i++) {
					for(j=num;j>=i;j--) {
							System.out.print(" ");
					}
					for(k=i;k>=1;k--)
						System.out.print(k);
					for(k1=2;k1<=i;k1++)
						System.out.print(k1);
				System.out.println();

				}	
				for(i=1;i<=num;i++) {
					for(j=i+1;j>=1;j--) {
							System.out.print(" ");
					}
					for(k=num-i;k>=1;k--)
						System.out.print(k);
					for(k1=2;k1<=num-i;k1++)
					{
						System.out.print(k1);
					}
				System.out.println();

	}

}
}