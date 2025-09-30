// 정수를 입력 받아 약수를 모두 출력하는 프로그램을 작성하시오 

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요: ");
		int num1 = sc.nextInt();
		int num2 = 1;
		
		while (num2 <= num1) {
			if (num1%num2 == 0) {
				System.out.println(num2);
			}
			num2 += 1;
		}
		sc.close();

		
	}
}
