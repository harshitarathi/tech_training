package assesment;
import java.util.*;

public class oddevensum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Initialize array  
        int [] arr = new int [10] ;
        int i,evensum=0,oddsum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=sc.nextInt();
        System.out.println("enter the elements of array ");
        for(i=1;i<=size;i++){
            arr[i]=sc.nextInt();
        }  
        for(i=1;i<=size;i++) {
        if(arr[i]%2==0) 
        	evensum=evensum+arr[i];
        else
        	oddsum=oddsum+arr[i];
        }        	
        System.out.println("even"+evensum);
        System.out.println("odd"+oddsum);
	}
}
