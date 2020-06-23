package Day14;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import java.io.*;
public class SortingString {

    public static void main(String args[]) 
    {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a sentense: ");
	    String str=sc.nextLine();
	    String words[]=str.split(" ");
	    Arrays.sort(words);
	    
	    for(int i=0;i<words.length;i++)
	    {
	    	System.out.println(words[i]);
	    }
    
    }
}



