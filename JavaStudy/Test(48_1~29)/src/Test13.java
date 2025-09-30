// Switch 문 이용!!!

// 사용자코드와 수도 사용량을 입력하여 총 수도요금을 계산하는 프로그램을 작성하시오.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test13 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("사용자 코드를 입력하시오.(1: 가정용 / 2: 상업용 / 3: 공업용)");
		String code = br.readLine();
		System.out.println("사용량을 입력하시오: ");
		int usage = Integer.parseInt(br.readLine());
		
		double charge;
		String name;
		
		switch (code) {
		case "1":
			charge = usage * 50 * 1.05;
			name = "가정용";
			break;
		case "2":
			charge = usage * 45 * 1.05;
			name = "상업용";
			break;
		case "3":
			charge = usage * 30 * 1.05;
			name = "공업용";
			break;	
			
		default: return; // switch 문에서 default 필수!!!
		};
		
		System.out.printf("* 사용자 코드 : %s(%s)%n", code, name);
		System.out.printf("* 사용량 : %dton%n", usage);
		System.out.printf("* 총 수도요금 : %.0f원%n", charge);
	}
}
