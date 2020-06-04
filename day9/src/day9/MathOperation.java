package day9;
import java.util.*;
//main function
public class MathOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		//taking input...............................................
		System.out.println("enter the first variable");
		int var1=Sc.nextInt();
		System.out.println("enter the second variable");
		int var2=Sc.nextInt();
		System.out.println("enter the operand");
		char op=Sc.next().charAt(0);
		//performing operations.............................................. 
		switch(op) {
		case '+' :
			System.out.println("addition "+ (var1+var2));
		break;
		case '-' :
			System.out.println("subtraction "+ (var1-var2));
		break;
		case '*' :
			System.out.println("mutliplication "+ (var1*var2));
		break;
		case '/' :
			System.out.println("division "+ (var1/var2));
		break;
		case '%' :
			System.out.println("modulus "+ (var1%var2));
		break;
		default:
			System.out.println("not a valid operand");
		}
		
	}

}
