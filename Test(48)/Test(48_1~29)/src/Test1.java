
// 제품의 원가 구하기 

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("제품의 가격을 입력하세요 : ");
		
		int price = scn.nextInt();
		
		double val = price * 0.1;
		double net = price - val;
		
		System.out.println("제품의 부가세 : " + val +"원");
		System.out.println("제품 원가 : " + net + "원");
	}
}
