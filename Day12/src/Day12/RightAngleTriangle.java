package Day12;

import java.util.Scanner;

class RightAngleTriangle
{
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter the value of the sides\n");
     System.out.print("Side 1 : ");
     a=sc.nextInt();
     System.out.print("Side 2 : ");
     b=sc.nextInt();
     System.out.print("Side 3 : ");
     c=sc.nextInt();
     System.out.print("\n");
     if(a>b&&a>c)
     {
         if((a*a)==(b*b)+(c*c))
         System.out.println("It is a right-angled triangle");
         else 
         System.out.println("It is not a right-angled triangle");
        }
        if(b>c&&b>a)
        {
            if((b*b)==(c*c)+(a*a))
            System.out.println("It is a right-angled triangle");
            else
            System.out.println("It is not a right-angled triangle");
        }
        if(c>a&&c>b)
        {
            if((c*c)==(a*a)+(b*b))
            System.out.println("It is a right-angled triangle");
            else
            System.out.println("It is not a right-angled triangle");
        }
    }
}
