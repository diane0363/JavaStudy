// 키보드로 정수를 입력 받아, 4와 5로 나누어 떨어지는 지의 여부를 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = scn.nextInt();
		
		if (num % 4 == 0 & num % 5 == 0) {
			System.out.println("4와 5로 나누어 집니다.");
		} else if (num % 4 == 0 || num % 5 == 0) {
			System.out.println("4와 5로 나누어 지지 않습니다.");
			System.out.println("4 또는 5로 나누어 집니다.");
			 
			if (num % 4 == 0) {
				System.out.println("4로 나누어집니다.");
			} else {
				System.out.println("5로 나누어집니다.");
			}
		}
		
		scn.close();
	}
}
