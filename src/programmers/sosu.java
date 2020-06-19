package programmers;

class Solution {
	public int solution(int n) {
		int answer = 0;
		for (int i = 2; i <= n; i++) {
			if (n < 2 && n > 1000000) {
				break;
			}
			int count = 0;
			for (int j = 2; j <= n; j++) {

				if (i % j != 0) {
					count++;
				}
				if (i <= j) {
					break;
				}
			}
			if ((count + 2) == i) {
				answer++;
			}
		}
		return answer;

	}
}

public class sosu {

	public static void main(String[] args) {
		Solution a = new Solution();
		System.out.println(a.solution(200));

	}

}
