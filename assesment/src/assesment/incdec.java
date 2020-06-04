package assesment;

public class incdec {

	public static void main(String[] args) {
    int a=7;
    int b=a++ - ++a - a++ + ++a -a--;
    System.out.println(b);
    int c=--a + a-- + ++a + a-- - ++a ;
    System.out.println(c);

	}

}
