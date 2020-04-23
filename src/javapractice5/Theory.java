package javapractice5;
// 클래스와 객체(인스턴스)의 차이점
// 클래스(코드), 객체(메모리에 클래스가 적재된 것)

// 객체 지향 프로그래밍의 3가지 특징
// 캡슐화 - 속성(상태 or 데이터), 메소드(동작 or 행위)를 하나로 묶는 것. 코드에서는 클래스를 통해서 구성하는 방법.
//		  data hide -> 멤버변수들을 private 접근자로 변경.
// 상속성 - 이미 정의된 상위클래스(부모 클래스)의 모든 속성과 메소드를 하위 클래스(자식클래스)가 사용할 수 있도록 하는 기능.
//		  (코드를 재사용해서 사용가능하도록 함.)
// 다형성 - 객체가 연산을 수행하게 될때 동일한 메소드에 대해서 각각의 객체가 가지고 있는 특성을 나타내는 기능.
// 		   (상속관계여야한다, override를 통해 구현된다.)

public class Theory {

	public static void main(String[] args) {
//		구구단 실습
		for(int i = 1; i<10; i++) {
			System.out.println(" ");
			for(int a =2; a<10; a++) {
				System.out.print(a+ "x" + i + "=" + i*a + "  ");
				if(i*a < 10) {System.out.print(" ");}
			}
		}

	}

}
