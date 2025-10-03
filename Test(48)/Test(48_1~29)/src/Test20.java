// 키보드로부터 정수를 입력 받아 1에서부터 입력 받은 수까지의 
// 자연수의 합을 모두 구하여 출력하시오.

import java.util.Scanner;

public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		
		int sum = 0 ;
		
		for (int i = 1; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("1~%d까지 더한 값 : %d", num, sum);
		sc.close();

	}
}
