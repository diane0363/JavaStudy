// 구구단을 출력하려는 정수를 입력하여 그 수의 구구단을 출력하는 코드를 작성하시오 
// 입력 받는 숫자는 2~9사이의 값이어야 하며 이 범위를 벗어나는 경우, 
// 에러메시지를 출력하고 종료할 것. 

import java.util.Scanner;

public class Test21 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();

//		if (num < 2 || num > 9) {
//			throw new Exception("[에러] 2~9만 입력"); // throws Exception 필수
//		}

		if (num < 2 || num > 9) {
			System.err.println("2~9만 입력");
			System.exit(1); // 0 은 정상 나머지는 에러
		}

		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.printf("%d x %d = %d %n", num, i, num*i);
		}
		sc.close();

	}
}
