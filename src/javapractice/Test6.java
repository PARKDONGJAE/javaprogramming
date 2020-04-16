package javapractice;

interface Printable1 {
	void print(String doc);
	default void printCMYK(String doc) {}
}
class prn909Drve1 implements Printable1{
	@Override
	public void print(String doc) {
		System.out.println("From MD-284 printer");
		System.out.println(doc);
	}
}
class Prn731Drve1 implements Printable1{
	@Override
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
	@Override
	public void printCMYK(String doc) {
		System.out.println("From MD-909 CMYK ver");
		System.out.println(doc);
	}
	
}
public class Test6 {
		public static void main(String[] args) {
			String myDoc = "This is report about...";
			
			Printable1 prn = new Prn731Drve1();
			Printable1 prn2 = new prn909Drve1();
			prn.print(myDoc);
			System.out.println();
			prn.printCMYK(myDoc);
		}
}
