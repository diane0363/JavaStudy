// 세 가지 수를 입력 받아 세 가지 수 중에 가장 큰 수부터 내림차순으로 정렬 하시오.  

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("1 : ");
		int f = scn.nextInt();
		
		System.out.println("2 : ");
		int s = scn.nextInt();
		
		System.out.println("3 : ");
		int t = scn.nextInt();
		
		if (f > s) {
			if (f > t) {
				if (s > t) {
					System.out.printf("%d\t%d\t%d",f,s,t);					
				} else {
					System.out.printf("%d\t%d\t%d",f,t,s);					
				}
			} else {
				System.out.printf("%d\t%d\t%d",t,f,s);
			}
		} else {
			if (s > t) {
				if (f > t) {
					System.out.printf("%d\t%d\t%d",s,f,t);					
				} else {
					System.out.printf("%d\t%d\t%d",s,t,f);					
				}
			} else {
				System.out.printf("%d\t%d\t%d",t,s,f);
			}
		}
		
		scn.close();
	}
}
