package Day12;

import java.util.ArrayList;
import java.util.Collections;

public class CommandLineProgram {

	public static void main(String[] args) {
		// Taking input.........................
		ArrayList<String>names=new ArrayList<String>();
		System.out.println("enetr the names ");
		for(int i=1;i<=args.length;i++) {
			names.add(args[i]);
		}
		
		Collections.sort(names);
		for(String s:names) {
			System.out.println(s);
		}

	}

}
