package main;

import java.util.Scanner;

import service.CarService;
import vo.Car;

public class CarMain {
	private static final Scanner sc = new Scanner(System.in); // static메서드에서 사용하기 위해
	private static final CarService service = new CarService();
	
	public static void main(String[] args) {
		
		while (true) {
			
			mainMenu();
			
			System.out.println("선택 : ");
			int menu = sc.nextInt();
			sc.nextLine(); 						// ***** 화이트어쩌고 제거 꼭 해주기! (nextLine이 엔터를 읽음) *****
			
			switch (menu) {
			case 1 : reservation(); break; // 예약 
			case 2 : search(); break; // 조회 
			case 3 : totalList(); break; // 전체 출력 
			case 4 : System.exit(menu); // 프로그램 종료 // return
			default: break;
			
			
			}
		}
		
	}
	
	
	private static void totalList() {
		Car[] car = service.findAll();
		for (int i = 0; i < car.length; i++) {
			Car c = car[i];
			
			System.out.println(c);
		}
	}


	private static void search() {
		
		System.out.println("전화번호 : ");
		String phoneNo = sc.nextLine().trim();
		
		Car c = service.findByCarNo(phoneNo);
		
		if (c != null) {
		System.out.println("이름 : "+ c.getName());
		System.out.println("차 번호 : "+ c.getCarNo());
		System.out.println("전화 번호 : "+ c.getPhoneNo());
		System.out.println("위치 : "+ c.getLoca());
		} else {
			System.out.println("예약 내역이 없음");
		}
	}


	public static void mainMenu() {
		System.out.println("""
=== 예약 프로그램 ===
1. 예약
2. 조회 
3. 전체 출력
4. 프로그램 종료
=====================
				""");
		
	}
	
	public static void reservation() {
		
		System.out.println("이름 : ");
		String name = sc.nextLine().trim();
		System.out.println("차번호 : ");
		String carNo = sc.nextLine().trim();
		System.out.println("전화번호 : ");
		String phoneNo = sc.nextLine().trim();
		System.out.println("위치 : ");
		String loca = sc.nextLine().trim();
		
		service.addReservation(new Car(name, carNo, phoneNo, loca));
		System.out.println("예약 저장 완료");
	}
	
}



