// 대학을 졸업하려면 최소 140학점을 이수한다. 이수한 학점 중 전공은 70학점 이상이어야 하며, 교양과 일
// 반은 각각 30학점이거나 총점이 80학점 이상이어야 합니다. 이수한 학점을 각각 입력 받아 졸업여부를 출
// 력하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int min = 140;
		
		System.out.println("전공 학점 : ");
		int major = scn.nextInt();
		System.out.println("교양 학점 : ");
		int rafin = scn.nextInt();
		System.out.println("일반 학점 : ");
		int gen = scn.nextInt();
		
		int total = major + rafin + gen;
		if (total >= 140 && major >= 70 && 
				((rafin >= 30 && gen >= 30) || (rafin + gen >= 80))) {
			System.out.println("졸업가능");
		} else {
			System.out.println("졸업 불가능");
		}
	}
}
