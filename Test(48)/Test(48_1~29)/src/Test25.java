// continue & break 사용 
// 성인 기본 요금 : 43,000
// 고객은 반복적으로 입력, 총 인원수 입력 시 0명 -> 처음부터 
// 입력 총 인원수 < 할인 적용 인원 수 -> 프로그램 종료

// 어떤 놀이동산에서 관람객의 입장료를 징수하는 시스템을 개발하려고 한다.  
// 만 18~60세는 일반비용으로 징수하고 18세미만, 60세 초과 인원은 15% 할인가격을 
// 적용하는 프로그램이다. 아래 제시된 실행 결과를 참고하여 프로그램을 완성하시오. 

import java.util.Scanner;

public class Test25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ppl = 0;
		double minor = 0;
		double senior = 0;
		double fee = 43000;
		
		
		while (true) {
			System.out.println("다음 손님 입장 : ");
			ppl = sc.nextInt();
			
			if (ppl == 0) {
				continue;
			}
			
			System.out.println("미성년 인원수? : ");
			minor = sc.nextInt();
			System.out.println("노인 인원수? : ");
			senior = sc.nextInt();
			
			if (ppl < minor + senior) {
				System.out.println("종료");
				System.exit(1);
			}
			
			double mnr_fee = minor * fee * 0.15;
			double snr_fee = senior * fee * 0.15;
			double total = ppl * fee - (mnr_fee + snr_fee);
			
			System.out.printf("* 1인 기본 요금 : %,.0f",fee);
			System.out.printf("* 미성년 요금 : %,.0f",mnr_fee);
			System.out.printf("* 노인 요금 : %,.0f",snr_fee);
			System.out.printf("* 총 지불 금액 : %,.0f",total);
			
			sc.close();			
			
		}

		
	}
}
