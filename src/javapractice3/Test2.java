package javapractice3;

import java.util.ArrayList;

public class Test2 {
	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("one");
		al.add("two");
		for (Object a :al) {
			System.out.println(al.toString());
		}
	}
}
