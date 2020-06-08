package Day13;
import java.util.*;

public class AdditionOfMatrix {
/*----------------adding two matrix---------------- */
    public static void main(String[] args) {
        int [][] mat1 = new int [5][5] ;
        int i,j, k , count=0;
        int [][] mat2 = new int [5][5] ;
        int [][] mat3 = new int [5][5] ;
        Scanner sc=new Scanner(System.in);
/*--------------size of matrix1------------------------------------ */
        System.out.println("enter the size of matrix1 row*column");
        int row1=sc.nextInt();
        int column1=sc.nextInt();
/*--------------------size of matrix2----------------------------- */        
        System.out.println("enter the size of matrix1 row*column");
        int row2=sc.nextInt();
        int column2=sc.nextInt();
/*----------------adding two matrices----------------------------- */
        if(row1==row2&&column1==column2)
        {
            System.out.println("enter the elements of matrix1 ");
            for(i=1;i<=row1;i++){
                for ( j=1; j<=column1; j++)
                mat1[i][j]=sc.nextInt();
            }  
       
            System.out.println("enter the elements of matrix2 ");
            for(i=1;i<=row2;i++){
                for ( j=1; j<=column2; j++)
                mat2[i][j]=sc.nextInt();
            }
            for(i=1;i<=row2;i++){
                for ( j=1; j<=column2; j++)
                    mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
/*------------------------output------------------------------ */
            System.out.println("sum of matrices is ");
                for(i=1;i<=row2;i++){
                    for ( j=1; j<=column2; j++)
                        System.out.print(mat3[i][j]+"  ");
                    System.out.println();
                }
                
        }  
        else
        System.out.println("enter the valid size of matrix");
    }
}