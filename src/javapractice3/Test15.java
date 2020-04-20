package javapractice3;
import java.util.ArrayList;

public class Test15 {
static Double add(ArrayList<? extends Number> num){
			double sum =0.0;
			for(Number n : num) {
				sum+=n.doubleValue();
			}
			return sum;
}
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(200);
		System.out.println(al);
		ArrayList<Double> al2 = new ArrayList<Double>();
		al2.add(10.0);
		al2.add(20.0);
		System.out.println(al2);

	}

}
