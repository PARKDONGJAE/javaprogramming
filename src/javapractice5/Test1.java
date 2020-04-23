package javapractice5;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("A");
		al1.add("아");
		al1.add("C");
		al1.add("D");
		for (int inx = 0; inx < al1.size(); inx++) {
			System.out.println(al1.get(inx));
		}
		for (String s : al1) {
			System.out.println(s);
		}
		Iterator<String> a = al1.iterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("A");
		hs.add("A");
		
		HashSet<String> hs2 = new HashSet<>();  //자동으로 소트?
		hs2.add("c");
		hs2.add("b");
		hs2.add("a");
		System.out.println(hs2);
		Map map = new HashMap();
		map.put(1, "one");
		map.put(3, "three");
		map.put(2, "two");
		map.put(4, "one");
		
		Set set = map.entrySet();
		Iterator lt = set.iterator();
		while (lt.hasNext()) {
//			System.out.println(lt.next());
			Object o = lt.next();
			Map.Entry e =(Map.Entry) o;
			System.out.println(e.getKey() + "," + e.getValue());
		}
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Test1");
		map2.put(2, "Test2");
		for(Map.Entry m : map2.entrySet()) {
			System.out.println(m.getKey() + "," +m.getValue()); 	
		}
		
	}
//	map -> key , value 로 이루어져있다.

}
