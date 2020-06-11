package programmers;

import java.util.ArrayList;
//최대공약수와 최소공배수를 구하는 문제
public class gongyaksu {

	public int[] solution(int n, int m) {
		int a = 0;
		int b = 1;

		if (m > n) {
			for (int i = 1; i <= n; i++) {
				if (n % i == 0 && m % i == 0) {
					a = i;
					
				}b = a*(m/a)*(n/a);

			}

		} else {
			for (int i = 1; i <= m; i++) {
				if (n % i == 0 && m % i == 0) {
					a = i;
					
				}b = a*(n/a)*(m/a);

			}

		}
		int[] answer = { a, b };
	
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gongyaksu g = new gongyaksu();
		int[] a = g.solution(12, 20);
		System.out.println(a[1]);
	}

}
