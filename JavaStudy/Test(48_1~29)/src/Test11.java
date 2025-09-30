//체중(kg)과 키(cm)를 입력 받아 저체중인지 정상체중인지, 과체중인지 여부를 출력하는 
//프로그램을 작성하시오.  
//이때, 공식은 아래와 같으며, 체중을 구했을 때 해당 체중의 10kg 미만은 “저체중”,  
//정상체중 -10~ 정상체중 +10 은 “정상 체중”, 정상체중 +10 초과의 값은 “과체중”입니다. 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test11 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("키입력: ");
		double height = Integer.parseInt(br.readLine());
		
		System.out.println("몸무게 입력: ");
		double weight = Integer.parseInt(br.readLine());
		
		double std = (height-100) * 0.9;
		
		if (weight < std - 10) {
			System.out.println("저체중 입니다.");
		} else if (weight > std + 10) {
			System.out.println("과체중 입니다.");
		} else {
			System.out.println("정상 체중 입니다.");
		}
		
		
	}
}
