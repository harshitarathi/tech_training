package assesment;

public class pattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i,j;
		char[][] a;
		for(i=1;i<=5;i++) {
			for(j=1;j<=5;j++) {
				if(i==1||j==5||i==5||j==1) 
					System.out.print("*");	 
				else
					System.out.print(" ");
				
				
			} 
			System.out.println();
		}
	}

}
