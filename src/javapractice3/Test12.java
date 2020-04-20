package javapractice3;

import java.util.ArrayList;
import java.util.Iterator;

public class Test12 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("하나");
		al.add("둘");
		al.add("셋");
		for(String a : al) {
			System.out.println(a);
		}
		for(Iterator<String> itr = al.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}

}
