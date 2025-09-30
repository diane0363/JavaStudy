// 1주일 간 일한 시간을 입력하여 총수입(gloss pay), 세금(taxes), 실수입(net pay)

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("* 1주일 간의 근무시간을 입력하시오. : ");
		int time = scn.nextInt();
		
		int wage = 10320;
		double gloss_pay;
		double net_pay;
		double tax;
		
		if (time <= 40) {
			gloss_pay = time * wage;
		} else {
			gloss_pay = 40 * wage + (time - 40) * wage * 1.5;
		}
		
		if (gloss_pay <= 300000) {
			tax = gloss_pay * 0.15;
			net_pay = gloss_pay * 0.85;
		} else {
			tax = 300000 * 0.15 + (gloss_pay - 300000) * 0.25;
			net_pay = gloss_pay - tax;
		}
		
		System.out.printf("총 수입 : %,.0f원%n",gloss_pay);
		System.out.printf("세   금 : %,.0f원%n",tax);
		System.out.printf("실 수입 : %,.0f원%n",net_pay);
	
		scn.close();
	}
}
