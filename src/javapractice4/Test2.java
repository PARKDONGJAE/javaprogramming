package javapractice4;

import java.util.*;
enum Animal {
	DOG, CAT}
enum Person{
	MAN, WOMAN
}
public class Test2 {

	public static void main(String[] args) {
		who(Person.WOMAN);
		who(Animal.DOG);
	}
	public static void who(Person man) {
		switch(man) {
		case MAN :
			System.out.println("남자입니다.");
			break;
		case WOMAN :
			System.out.println("여자입니다.");
			break;
		}
	}
	public static void who(Animal man) {
			switch(man) {
			case DOG :
				System.out.println("개입니다.");
				break;
			case CAT :
				System.out.println("고양이입니다.");
				break;
			}
	}
	}
