// 원의 넓이 구하기

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("원의 반지름 : ");
		
		int radius = scn.nextInt();
		
		double area = radius * radius * 3.14;
		
		System.out.println("반지름 " + radius + "인 원의 면적 : " + area);
	}
}
