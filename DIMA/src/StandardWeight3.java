/* 4) 4단계
 * 
 * 남성의 표준 몸무게 = 키(cm) * 키(cm) * 22;
 * 여성의 표준 몸무게 = 키(cm) * 키(cm) * 21;
 * 
 * 키보드로 데이터를 입력받아 처리하시오
 * 성별을 입력받아서 처리하시오
 * 
 * BMI 계산하고 
 * 비만도(%) = 실체중 / 표준체중 * 100 (표준 체중 대비 실체중의 비율) 
 * 
 * <출력 결과> 
 * 키 175.80cm인 남성의 표준 체중은 76.00Kg 입니다. -> printf()
 * BMI는 25.45이고,
 * 비만도(%)는 1.4%입니다.
 */

import java.util.Scanner;

public class StandardWeight3 {

	public static void main(String[] args) {

		Scanner keyin = new Scanner(System.in);

		String gender;
		double height, temp, fatRatio, bmi, weight;
		double stdWeight;            
		
		System.out.println("성별(남/여)을 입력하시오 ");
		gender = keyin.next();            

		System.out.println("키를 입력하시오 ");
		height = keyin.nextDouble();
		
		
		System.out.println("몸무게를 입력하시오 ");
		weight = keyin.nextDouble();
		
		// 표준 체중 구하기
		temp = height / 100;
		

		// 객체 비교                        .equals() 사용  
		// primitive 타입일 때 비교         == 사용 
		
//		gender == "남";             // 주소를 비교 
		if(gender.equals("남"))         // 값(데이터)을 비교
			stdWeight = temp * temp * 22;
		else
			stdWeight = temp * temp * 21;

		// bmi 구하기
		bmi = weight / (temp * temp);
		
		// 비만율 구하기
		fatRatio = weight / (stdWeight * 100);
		
		System.out.printf("키가 %.2fcm인 %s의 표중체중은 %.2fKg입니다.%n", height, gender, stdWeight);
		
		System.out.printf("BMI는 %.2f이고%n", bmi);
//		System.out.printf("비만도(%)는 %.2f%%입니다.%n", fatRatio);  // 에러가 뜬다. 꼭 %를 쓰고 싶을 땐 %% 두 개 써주기!!!
		System.out.printf("비만도(%%)는 %.2f%%입니다.%n", fatRatio);
		
		
		keyin.close();
	}

}
