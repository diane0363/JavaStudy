// 연도를 입력 받아 서기 1년~입력 년도 n사이의 모든 돼지의 해를 출력하고 
// 돼지의 해가 몇 번인지 출력하시오

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("년도");
		int year = sc.nextInt();
		int i = 0;
		
		for (i = 0; i*12+3 <= year; i++) {
			System.out.printf("%d 년%n",i*12+3);
		}
		
		System.out.println(i);
		sc.close();

	}
	
}
