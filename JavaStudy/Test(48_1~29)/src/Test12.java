// 키보드로부터 직장인의 연간 근로소득을 
// 입력 받아 이에 대한 소득세를 계산하는 프로그램을 설계하라. 

// 근로소득이 2,000만원 이하이면 소득의 5% 
// 근로소득이 2,000만원~4000만원 이하이면 소득의 15% 
// 근로소득이 4,000만원~8000만원 이하이면 소득의 25% 
// 근로소득이 8,000만원을 초과하면 소득의 40%

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test12 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("연간 근로소득 입력 (만): ");
		double salary = Integer.parseInt(br.readLine());
		double tax;
		
		if (salary <= 2000) {
			tax = salary * 0.05;
		} else if (salary <= 4000) {
			tax = salary * 0.15;
		} else if (salary <= 8000) {
			tax = salary * 0.25;
		} else {
			tax = salary * 0.4;
		}
		
		System.out.printf("당신의 소득세는 : %.1f입니다.",tax);
	}
}
