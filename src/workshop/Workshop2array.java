package workshop;

class check{
	String[] a;
	String[] answer = {"D","B","D","C","C","D","A","E","A","D"};
	public void checker(String[] a) {
		int b = 0;
		for(int i = 0; i<a.length; i++) {
			if (a[i]==answer[i]) {
				b++;
			}
		}
		System.out.println("학생은"+ b+ "개 맞췄습니다.");
	}
}
class Workshop2array {
	public static void main(String[] args) {
//		static String[] answer = {"D","B","D","C","C","D","A","E","A","D"};
		String[] stu1 = {"A","B","A","C","C","D","E","F","A","D"};
		String[] stu2 = {"D","B","A","B","C","A","E","F","A","D"};
		String[] stu3 = {"E","D","D","A","C","B","E","E","A","D"};
		String[] stu4 = {"C","B","A","E","D","D","E","F","A","D"};
		String[] stu5 = {"A","B","D","C","C","D","E","E","A","D"};
		check c = new check();
		c.checker(stu2);
	
	}
		
}