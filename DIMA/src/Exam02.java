/*
 * 사용자 코드와 수도 사용량을 입력하여 총 수도 요금을 계산하는 프로그램을 작성하시오
 * 
 * <계산 방식>
 * 사용자 코드
 *  1 - 가정용(ton 당 50원)
 *  2 - 상업용(ton 당 45원)
 *  3 - 공업용(ton 당 30원)
 *  
 *  수도 사용 요금 = 사용량 * ton당 가격
 *  총 수도 요금 = 수도 사용 요금 + 세금(수도 사용 요금의 5%)
 *  
 * <입력 양식>
 * 사용자 코드를 입력하시오(1: 가정용 / 2 : 상업용 / 3 : 공업용)
 * 사용량을 입력하시오(ton 단위): 20
 * 
 * <출력 양식>
 * 사용자 코드 : 1(가정용)
 * 사용량 : 20ton
 * 총 수도 요금 : 1050원
*/

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		
// 나으 풀이 -------------------------------------------------------------------------------
		
		int code, ton, fee = 0; // fee = 0 으로 설정해주지 않으면 total 식에서 Error 발생 (지역 변수는 초기화까지@)
		double tax, total;
		String codename = ""; // 마찬가지로 if 문에서 정해지기 때문에 변수 리셋 해줘야함 (code가 5일 경우 codename에 값이 저장되지 않기 때문에 해당 에러 방지)
			// "" 로 초기화하는 경우 길이가 0인 문자열 객체가 힙에 저장 
		
		codename = null; // 이렇게 초기화 시켜주기 ~ 
			// null로 초기화하는 경우 객체, 참조주소 X (아직 값이 정해지지X)
		
		
		System.out.print("사용자 코드를 입력하시오(1: 가정용 / 2: 상업용/ 3: 공업용) : ");
		code = keyin.nextInt();
		
		System.out.print("사용량을 입력하시오(ton단위) : ");
		ton = keyin.nextInt();
		
//		if (code.equals(1)) // int 타입은 equals 를 쓸 수가 없대여 (primitive 타입이어서!)
//		실행문 한 줄일 때 {} 생략 가능
		if (code == 1) {
			fee = 50;
			codename = "가정용";
		}
		else if (code == 2) {
			fee = 45;
			codename = "상업용";
		}
		else if (code == 3) {
			fee = 30;
			codename = "공업용";
		}
		
		total = fee * ton + (fee * ton) * 0.05;
		
		
		System.out.printf("사용자 코드 : %d (%s) %n", code, codename);
		System.out.println("사용량: "+ ton + "ton");
		System.out.printf("총 수도 요금: %.0f원", total);
                                                                                       //		
		
		
// 교수님 풀이  -----------------------------------------------------------------
//		
//		int code;
//		int usedAmount;
//		int waterBill = 0;
//		int totalWaterBill;
//		double tax = 0.05;
//		
//		// 1) 입력
//		System.out.print("사용자 코드 입력"); 
//		code = keyin.nextInt();
//		
//		System.out.print("사용량 입력(ton):");
//		usedAmount = keyin.nextInt();  // usedAmount cannot be resolved to a variable
//		
//		// 2) 처리
//		if(code == 1) {
//			waterBill = usedAmount * 50;
//		}
//		else if(code == 2) {
//			waterBill = usedAmount * 45;
//		}
//		else if(code == 3) {
//			waterBill = usedAmount * 30;
//		}
//		
//		totalWaterBill = waterBill + (int)(waterBill * tax);
//				
//		//3) 출력
//		System.out.printf("사용자 코드 : %d %n", code);
//		System.out.printf("사용량: %d톤 %n", usedAmount);
//		System.out.printf("총 수도요금: %d원%n", totalWaterBill);
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
