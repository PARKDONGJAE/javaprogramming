package javapractice4;

public class Test4 {
	static void test1(String[] str) {
		for(int inx = 0; inx <str.length; inx++) {
			System.out.println(str[inx]);
		}
	}
	static void test2(String...str2) {
		for(int inx = 0; inx <str2.length; inx++) {
			System.out.println(str2[inx]);
		}
	}
	public static void main(String[] args) {
		test2("1","2","3","4");
		String[] a= {"1","2","4","5"};
		test1(a);

	}

}
