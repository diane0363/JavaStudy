// 단위를 입력 받고 길이를 입력 받아 cm는 inch로, inch는 cm로 변환하는 코드를 작성하시오. 

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		
		System.out.println("입력단위는 (1. cm, 2. Inch) : ");
		int measure = scn.nextInt();
		
		System.out.println("길이 입력 : ");
		double length = scn.nextDouble();

		if (measure == 1) {
			double result = length * 0.3937;
			System.out.println(length + "cm = " + result + "inch");
		} else if (measure == 2) {
			double result = length * 2.54;
			System.out.println(length + "inch = " + result + "cm");
		}
		
	}
	
}
