package Day13;

import java.util.Scanner;

public class MirrorMatrix {

		/*----------------adding two matrix---------------- */
	    public static void main(String[] args) {
	        int [][] mat1 = new int [5][5] ;
	        int i,j, k ;
	        int [][] mat2 = new int [5][5] ;
	        Scanner sc=new Scanner(System.in);
	/*--------------size of matrix1------------------------------------ */
	        System.out.println("enter the size of square matrix");
	        int row=sc.nextInt();
	            System.out.println("enter the elements of matrix ");
	            for(i=1;i<=row;i++){
	                for ( j=1; j<=row; j++)
	                mat1[i][j]=sc.nextInt();
	            }  
	            for(i=1;i<=row;i++){
	                for ( j=row,k=1; j>=1; j--,k++)
	                mat2[i][k]=mat1[i][j];
	            }
    //output ..............................................................
	            System.out.println("real matrix is  ");
                for(i=1;i<=row;i++){
                    for ( j=1; j<=row; j++)
                        System.out.print(mat1[i][j]+"  ");
                    System.out.println();
                }
	            System.out.println("mirror matrix is  ");
                for(i=1;i<=row;i++){
                    for ( j=1; j<=row; j++)
                        System.out.print(mat2[i][j]+"  ");
                    System.out.println();
                }
	}

}
