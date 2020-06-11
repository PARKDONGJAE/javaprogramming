package programmers2;

public class Solution {
	public static String solution(String[] participant, String[] completion) {

		String answer = "";
		for (int i = 0; i < completion.length; i++) {
			for (int j = 0; j < participant.length; j++) {
				if (participant[j].equals(completion[i])) {
					participant[j] = "x";
					completion[i] = "y";
					break;

				}
			}
		}
		for (int a = 0; a < participant.length; a++) {
			if (participant[a] != "x") {
				answer = participant[a];

			}
		}
		return answer;
	}

	

	public static void main(String[] args) {
		Solution s = new Solution()	;
		String[] a = {"leo", "kiki", "eden"};
		String[] b = {"eden", "kiki"};
		System.out.println(s.solution(a,b));
	}

}
