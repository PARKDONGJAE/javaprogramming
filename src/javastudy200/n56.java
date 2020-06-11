package javastudy200;

import java.util.*;
public class n56 {
//배열보다 편한 List
	public static void main(String[] args) {
		List<Integer>ilist = new ArrayList<>();
		//넣기
		for(int i = 1; i<=10; i++) {
			ilist.add(i);
		}
		//가져오기
		for(int i = 0 ; i<ilist.size(); i++) {
			int m = ilist.get(i);
			System.out.printf("%d\t",m);
		}
		System.out.println();
	}

}
