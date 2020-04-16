package javapractice;

interface Printable{
	void print(String doc);
}
class prn909Drv implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-284 printer");
		System.out.println(doc);
	}
}
class Prn731Drv implements Printable{
	@Override
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
	
}
public class Test3 {
		public static void main(String[] args) {
			String myDoc = "This is report about...";
			
			Printable prn = new Prn731Drv();
			Printable prn2 = new prn909Drv();
			prn.print(myDoc);
			System.out.println();
			prn2.print(myDoc);
		}
}
