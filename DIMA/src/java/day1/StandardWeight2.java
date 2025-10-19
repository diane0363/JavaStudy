/* 1) 3단계
 * 
 * 남성의 표준 몸무게 = 키(cm) * 키(cm) * 22;
 * 여성의 표준 몸무게 = 키(cm) * 키(cm) * 21;
 * 
 * 키보드로 데이터를 입력받아 처리하시오
 * 성별을 입력받아서 처리하시오
 * 
 * <출력 결과> 
 * 키 175.80cm인 남성의 표준 체중은 76.00Kg 입니다. -> printf()
 * 
 */
package java.day1;

import java.util.Scanner;

public class StandardWeight2 {

	public static void main(String[] args) {

		Scanner keyin = new Scanner(System.in);

		String gender;
		double height, temp;
		double stdWeight;            // 67.99
		
		System.out.println("키를 입력하시오 ");
		height = keyin.nextDouble();
		
		System.out.println("성별(남/여)을 입력하시오 ");
		// keyin.next() 와 keyin.nextline()의 차이 
		gender = keyin.next();            

		temp = height / 100; 

		// 객체 비교                        .equals() 사용  
		// primitive 타입일 때 비교         == 사용 
		
//		gender == "남";             // 주소를 비교 
		if(gender.equals("남"))         // 값(데이터)을 비교
			stdWeight = temp * temp * 22;
		else
			stdWeight = temp * temp * 21;
		
		
		System.out.printf("키가 %.2fcm인 %s의 표중체중은 %.2fKg입니다.", height, gender, stdWeight);
		
		keyin.close();
	}

}
