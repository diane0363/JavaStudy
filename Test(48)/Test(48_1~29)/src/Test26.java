// 이중 반복문(for문)을 이용하여 소수 출력하기
// 정수를 입력받아 해당 정수까지 있는 모든 소수를 모두 출력하고 소수의 개수를 출력하시오

// 숫자 2도 소수 ! 

import java.util.Scanner;

public class Test26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int n1 = sc.nextInt();

		int n2 = 0;
		
		int count = 0;
		
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0) {
				System.out.printf("%d\t",i);
				count++;
			}
		}
		
		System.out.println();
		System.out.printf("2~%d까지 소수의 개수는 %d개입니다.", n1, count);
			
		sc.close();
	}
}
