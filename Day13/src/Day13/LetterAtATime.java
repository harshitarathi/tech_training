package Day13;
import java.util.*;

public class LetterAtATime {

	public static void main(String[] args) {
		// Taking input.................
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message");
		String msg=sc.nextLine();
		int count=0,lastpos;
		lastpos=msg.length()-1;
		System.out.println("number of characters in message : "+msg.length());
		System.out.println("starting character is at index 0 the character is "+msg.charAt(0));
		System.out.println("last character is at index "+msg.length()+" the cahracter is "+msg.charAt(lastpos));
		for(int i=0;i<msg.length();i++) {
			System.out.println("character at index "+i+" is "+msg.charAt(i));
			if(msg.charAt(i)=='a'||msg.charAt(i)=='A')
				count++;
		}
		System.out.println("the number of a's in message is "+count);
		

	}

}
