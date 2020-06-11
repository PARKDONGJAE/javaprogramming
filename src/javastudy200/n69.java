package javastudy200;

public class n69 {
	public static void main(String[] args) {
		StringBuffer sb1 =new StringBuffer();
		sb1.append("hi").append("bye").append("ㅋㅋ");	
	System.out.println(sb1.toString() +sb1.hashCode());
	sb1.replace(0, 2, "mm");
	System.out.println(sb1);
	sb1.reverse();
	System.out.println(sb1);
	sb1.delete(1, 4);
	System.out.println(sb1);
	
	}

}
