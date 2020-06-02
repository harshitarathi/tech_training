package assesment;

import java.util.Scanner;

public class pairsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int [] arr = new int [10] ;
	        int i,j,temp,temp2;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter the size of array");
	        int size=sc.nextInt();
	        System.out.println("enter the elements of array ");
	        for(i=1;i<=size;i++){
	            arr[i]=sc.nextInt();
	        }
	        for(i=1;i<=size;i++) {
	        	temp=arr[i];
	        	for(j=i+1;j<=size;j++) {
	        		temp2=arr[j];
	        		if(temp+arr[j]==8)
	        			System.out.println("pair"+"("+arr[i]+","+arr[j]+")");
	        	}
	        }
	}

}
