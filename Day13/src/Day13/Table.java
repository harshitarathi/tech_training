/**
 * Author harshita rathi
 *
 */
package Day13;

import java.util.*;
public class Table{
    public static void main (String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the number to know the table");
    int num=sc.nextInt();
    System.out.println("enter the limit");
    int limit=sc.nextInt();
    int i;
    int table[]=new int[20];
    for( i=1; i<=limit; i++)
    {
        table[i]=num*i;
        System.out.println(num+" * "+i+" = "+table[i]);
    }
}
}