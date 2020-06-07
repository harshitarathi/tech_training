package Day11;
import java.util.*;
public class CompareArray {

	public static void main(String[] args) {
		// taking input...............................
		Scanner sc=new Scanner(System.in);
		//array1................................
		System.out.println("Enter the size of array1");
		int size1=sc.nextInt();
		System.out.println("Enter elements of array1");
		int[] arr1=new int[100];
		for(int i=1;i<=size1;i++) {
			arr1[i]=sc.nextInt();
		}
		// array2...............................
		System.out.println("Enter the size of array 2");
		int size2=sc.nextInt();
		System.out.println("Enter elements of array 2");
		int[] arr2=new int[100];
		for(int i=1;i<=size2;i++) {
			arr2[i]=sc.nextInt();
		}
		//comparing...........................
		int flag=0;
		if(size1==size2) {
			for(int i=1;i<=size1;i++) {
				if(arr1[i]==arr2[i]) 
					flag=1;
			}
		}
		if(flag==1) 
			System.out.println("same");
		else
			System.out.println("different");	

	}
}