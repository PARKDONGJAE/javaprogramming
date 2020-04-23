package javapractice5;
interface Calc<T>{
	T opreation(T a, T b);
}
public class Test4 {	
public static void main(String[] args) {
	Calc<Integer> c =(x,y) ->{
		return x+y;
		
	};
	System.out.println(c.opreation(1, 4));
	Calc<Double> f = (s,b)	->{
		return (s+b);
	};
	System.out.println(f.opreation(6.0, 3.0));
	}

}
