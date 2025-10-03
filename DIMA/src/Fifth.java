/*
 * Ctrl + S 저장
 * Ctrl + Shift + S 저장
 * Ctrl + space 자동완성 
 * Ctrl + F11 실행 
 * Ctrl + a 전체 선택 
 * Ctrl + i 들여쓰기 
 * Ctrl + d 한 줄 삭제 
 * Ctrl + y redo (undo를 되돌림)
*/


public class Fifth {

	public static void main(String[] args) {
		// 1) 지역변수 선언, 초기화 
		int radius = 5; 
		final double PI = 3.14;        // final은 값을 변경할 수 없도록 지정 (상수화된 상수 변수 -> 대문자로 써야함)
		double area = PI * radius * radius;
		
//		PI = 3.141592;      // 재대입 불가 Error 
		
		System.out.println("반지름 5인 원의 면적: " + area);
		
	}

}
