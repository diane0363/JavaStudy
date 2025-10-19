/*
 * 입력 함수 : nextInt(), nextDouble(), next(), nextLine() 
 * nextInt()와 nextDouble()은 내부적으로 파싱 작업을 한다. -> 파싱가능한 데이터만(white space 불가)
 * 
 * next() 는 white space전까지만 데이터를 들고온다. 
 * White Space: 탭, 스페이스, 엔터 (입력 버퍼 내의 데이터를 변수로 이동)
 * nextLIne()은 white space를 포함해 데이터를 들고온다. 
 * 
 * 문자열 입력받는 메소드 (next(), nextLine())를 사용하여 
 * 입력 버퍼에 대해 익혀봅시다. (범퍼와 비슷한 개념, 입력 완충을 위한 메모리 공간이 일시적으로 생김) 
 * 
 * 
 * (문제!) 
 * next() 와 nextLine()의 차이는? 
 * println()과 printf()의 차이는? 
 */
package java.day1;

import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
	
		String name, n1, n2, addr, phone;
		int age; 
		
		System.out.print("이름: ");

		// '김 다인'으로 입력 시 n1, n2에 각각 김, 다인이 저장되어 출력 (nextInt, nextDouble도 마찬가지)
//		n1 = keyin.next(); // 한개의 단어만 입력 받음. 문장 입력 불가.
//		n2 = keyin.next(); 
//		System.out.println(n1);
//		System.out.println(n2);
		
		name = keyin.nextLine(); // 문장 입력 가능 (띄어쓰기 포함) 
		
		
		
		// 엔터가 버퍼에 남아있다. -> 파싱이 안 되는 값은 nextInt()가 파싱 작업 중 버린다.
		System.out.print("나이: ");
//		name = keyin.next(); 
		age = keyin.nextInt(); // 버퍼가 비워지게 됨 ====> 25 엔터
		
		keyin.nextLine(); // 버퍼를 비워줌으로써 엔터 찌꺼기를 없앤다. 
		
		// 엔터 찌꺼기가 남음 -> nextLine()은 엔터를 가지고감 
		System.out.print("주소: ");
//		addr = keyin.next(); 
		addr = keyin.nextLine(); // 엔터 찌꺼기로 인해 값 입력 불가 

		System.out.print("전화번호: ");
//		phone = keyin.next(); 
		phone = keyin.nextLine(); 
		
		
		System.out.println("너의 이름은: " + name);   // printf 와 달리 + 로 문자열과 값을 연결 
		System.out.println("너의 나이는: " + age);   
		System.out.println("너의 주소는: " + addr);   
		System.out.println("너의 전화번호는: " + phone);   
		
	}

}
