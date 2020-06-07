package Day12;
import java.util.*;

public class HandleException {

	public static void main(String[] args) {
		// Taking input.........................................
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size=sc.nextInt();
		int arr[]=new int[20];
		System.out.println("enter the element  of array ");
		for(int i=1;i<=size;i++) {
			arr[i]=sc.nextInt();
		}
		try {
			System.out.println("enter the index ");
			int index=sc.nextInt();
			if(index<size)
				System.out.println("the value at index "+" "+index+"is"+arr[index]);
			else
				throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println(e);
		}
	}

}
