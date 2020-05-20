package baekjun;

import java.util.Scanner;

//숫자의 개수
//세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.

//예를 들어 A = 150, B = 266, C = 427 이라면 
//
//A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
//
//계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
public class n2577 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	int d =a*b*c;
	int [] arr = new int[10];
		for(int i = 0; i<10; i++) {
			arr[i]=0;
			
		}
			for(int i = 0; i<10; i++) {
				if(d>0) {
			
				arr[(d%10)]=arr[(d%10)]+1;
				d=d/10;
			}
			}		

		for (int n =0 ; n<10; n++) {
			System.out.println(arr[n]);
			}
		
	}

}
