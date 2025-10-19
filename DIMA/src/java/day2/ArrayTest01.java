/*
 * 배열
 * 	- linear 자료형 (접근 용이)
 * 	- 동일 타입 변수의 집합
 * 	- 대량 정보 저장 시 유용, index를 통해 접근 -> 반복처리 가능
 */
package java.day2;

public class ArrayTest01 {

	public static void main(String[] args) {
		
		// 타입[] 배열명 = new 타입[개수]; // 개수지정 필수!
		// 지역변수 stack 메모리 공간에 생성. heap에 생성된 배열 참조

		int[] ary = new int[10];         // ary는 참조변수, 주소는 b[0]의 값

		// integer 타입 저장 가능한 방 10개가 heap영역에 생성 (0~9번 인덱스)
		// 각 방의 값은 0으로 자동 초기화. 0으로 출력된다.
		// 0번 방의 주소를 b 변수에 넣는다. 
		// 힙 영역의 변수 안에는 기본적으로 0으로 초기화 된다. 
		// read only 속성의 length 값(방의 개수)이 자동 생성 ***
		// 프로그램 시작 후 run time 싱 방크기 조절 불가 
		
		System.out.println("방의 개수: " + ary.length);
		System.out.println("ary의 값: " + ary);        // 실제 주소는 X, hash 주소값
		// 주소 역추적 불가능 (주소를 알면 값 변경을 할 수 있기 때문에 위험해서 막음. C는 가능)

		System.out.println("ary[0]의 값: " + ary[0]);  // 초기값은 0으로 저장된다.
		
		ary[0] = 2;        // 2 0 0 0 0 0 0 0 0 0
		ary[1] = 4;        // 2 4 0 0 0 0 0 0 0 0 
		
		// 선형 자료 구조 : 배열 
 		// (최대값을 기준으로 방을 확보해야함. 데이터수 > 방의 수 -> 추가 확보 불가)
		// 바이트 수에 따라 주소 지정 int의 경우. 정수(4byte). 100 104 108 112 ... 
		
		
		// 객체 배열
			// 객체 타입으로 배열 생성
		
		
		
		int[ ] iArray = new int[10];		// 기본형 	
		char[] cArray = new char[5];		// 기본형
		String[] sArray = new String[4];	// 객체 배열
//		Human[] hArray = new Human[15];		// 객체 배열 (아직 Human 클래스 생성X)

		// 초기화
		iArray[0] = 12;
		cArray[3] = '말';
		sArray[1] = new String();
		sArray[2] = "text";
//		hArray[1] = new Human(); 

		// 객체를 생성해서 몇번방에 넣는다. -> 객체 배열
		// 단순한 값을 넣는다. -> 일차원 배열 
		
		
	}
}
