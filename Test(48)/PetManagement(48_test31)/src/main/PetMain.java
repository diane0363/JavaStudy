package main;

import java.util.Scanner;

import vo.Pet;

public class PetMain {
	private static final Scanner sc = new Scanner(System.in);
	private final Pet[] petList = new Pet[100]; 
	public static void main(String[] args) {
		
		int num = 0;
		
		while(true) {
			
			mainmenu();
			
			System.out.println("선택 : ");
			num = sc.nextInt();
			
			if (num < 1 || num > 3) {
				continue;
			} else {
				
			}
		}
		
	}
	
	private static void mainmenu() {
		System.out.println("""
===== Pet Shop =====
1. 애완 동물 등록
2. 전체 출력
3. 프로그램 종료				
====================
				""");
	}
	
	private static void registration() {
		
	}
}
