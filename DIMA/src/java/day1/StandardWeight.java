/* 1) 1단계
 * 남성의 표준 몸무게 = 키(cm) * 키(cm) * 22;
 * 여성의 표준 몸무게 = 키(cm) * 키(cm) * 21;
 * 
 * <출력 결과> 
 * 키 175.80cm인 남성의 표준 체중은 76.00Kg 입니다. -> printf()
 * 
 * 2) 2단계
 * 키보드로 데이터를 입력받아 처리하시오
 * 
 */
package java.day1;

import java.util.Scanner;

public class StandardWeight {

	public static void main(String[] args) {

		Scanner keyin = new Scanner(System.in);

		double height, temp;
		double stdWeight;            // 67.99
		
		System.out.println("키를 입력하시오 ");
		height = keyin.nextDouble();
		
		temp = height / 100; 
		stdWeight = temp * temp * 22;
		
		System.out.printf("키가 %.2fcm인 남성의 표중체중은 %.2f입니다.", height, stdWeight);
		
		keyin.close();
	}

}
