package day10;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if((i+j)>=6)
					System.out.print(j);
				else
					System.out.print(" ");
								
			}
				for(l=4;l>=1;l--) {
				if((i+l)>=6)
					System.out.print(l);
				else
					System.out.print(" ");
								
			}
			System.out.println();
		}

	}

}
