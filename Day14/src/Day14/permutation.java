package Day14;
import java.util.*;
//Java program to print all the permutations 
//of the given string 
public class permutation { 

	// Function to print all the permutations of str 
	static void printPermutn(String str, String ans) 
	{ 

		// If string is empty 
		if (str.length() == 0) { 
			System.out.print(ans + " "); 
			return; 
		} 

		for (int i = 0; i < str.length(); i++) { 

			// ith character of str 
			char ch = str.charAt(i); 

			// Rest of the string after excluding 
			// the ith character 
			String ros = str.substring(0, i) + 
						str.substring(i + 1); 

			// Recurvise call 
			printPermutn(ros, ans + ch); 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s =sc.nextLine(); 
		printPermutn(s, ""); 
	} 
} 

