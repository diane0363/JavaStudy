// 사용자가 만든 클래스 (사용자 정의 클래스) 
// 객체 배열을 만들려면 클래스 정의를 먼저 해야함 
// 클래스 정의 (클래스를 만든 것은 X) - 사용을 하려면 반드시 생성하고 사용해야함 (new 이용) 
package java.day3;

class Human{
	// 메인 함수X -> 멤버 변수
	String name; 
	int age; 

	// 생성자(Constructor) 메소드 - 클래스 객체를 생성하고 초기화 시켜주는 함수 
	Human(String n, int a) {
		this.name = n;  // this는 파이썬의 Self
		this.age = a;   
	}
}



public class ArrayObjectTest_3 {
	// 멤버 변수 (멤버 밖)
	public static void main(String[] args) {
		// 지역 변수 (멤버 안) 
		Human h1 = new Human("전우치", 25);  // new Human -> 위에서 만든 생성자 메소드를 호출 (참조)
		Human h2 = new Human("손오공", 21); 	
		Human h3 = new Human("사오정", 29); 	
		
		// 같은 타입의 변수들을 함께 관리하기 위해 배열 사용 
		Human[] hAry1 = new Human[3];    // 객체 배열 (주로 일차원 배열을 이용)
		hAry1[0] = h1; 
		hAry1[1] = h2; 
		hAry1[2] = h3; 
		
		Human[] hAry2 = new Human[] {
				new Human("전우치", 25), 
				new Human("손오공", 21), 
				new Human("사오정", 29)
			};   
		
		Human[] hAry3 = {h1, h2, h3}; 
		
//		for(Human h: hAry2) System.out.println(h);  // h는 주소를 가진다. -> h.name h를 따라가서 값을 읽어온다. (직접 접근 - 원래 이렇게 하면 X)
		for(Human h: hAry2) System.out.println(h.name + " / " + h.age);  // 객체 지향언어에서 직접 접근은 비권장 (하지만 가능은 하다)
		// 해당 방식과 같은 직접 접근을 막아두는 것이 캡슐화 
		
		// 파이썬 - 리스트, 판다스 (2차원) / 색상 (3차원) .. 
		// 자바에서도 3차원부터는 거의 사용X (제어하기 어려움)
		
		}
		
	}
