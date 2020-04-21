package javapractice4;

import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		List<String> list3 = new Vector<String>();
		List<String> list4 = new Stack<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		Iterator<String>ltr = list.iterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		for(int inx= 0; inx<list.size(); inx++) {
			System.out.println(list.get(inx));
		}
		for(String s :list) {
			System.out.println(s);
		}
		System.out.println("sort");
		Collections.sort(list);
		for(String s :list) {
			System.out.println(s);
		}
		
	}
}
