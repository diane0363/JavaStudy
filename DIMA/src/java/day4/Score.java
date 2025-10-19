// 메인 메소드는 프로그램 구동용
// 데이터 수집용 클래스에서는 메인 메소드가 필요X => 지역 변수가 없다.

// 클래스의 선언
package java.day4;

public class Score {
// 멤버 변수 (= 인스턴스 변수) -> 멤버 변수는 한 줄에 하나씩 선언해준다. ( = 우리 멤버 )
//	private String id;			// private 멤버 변수 - 외부에서 접근 불가
//	String name;				    // default
//	public double kor;      // public 
//	protected double eng;   // protected 
//	double math;            // double 
	
	// VO 클래스는 모든 멤버 변수를 private로, 그리고 보일러플레이트 코드는 자동생성으로 해주기 
	private String id;			// private 멤버 변수 - 외부에서 접근 불가
	private String name;				// default
	private double kor; 
	private double eng;
	private double math;
	
	// 멤버 메소드(인스턴스)는 레퍼런스 변수(참조 변수)를 통해서만 접근 가능
			// => 멤버 메소드는 객체가 있어야 호출 가능하다!!
	
	// 레퍼런스 변수 특징
			// null 가능 : 아무 객체도 가리키지 X 
			// stack 에 저장 
			// 다형성(업캐스팅) 가능 : 참조 타입과 실제 객체가 다르다 (실행 시점에 실제 객체의 오버라이딩 메소드 호출) **
	
	// 멤버에 접근하는 메소드 setter / getter -> 보일러플레이트 코드는 자동생성하는 것이 생산성 측면에서 좋다. 
	// setter
	public void setId(String i) { // 우리멤버 id와 동일한 데이터 타입, id는 지역 변수 (메소드의 매개변수로 선언), 리턴 타입 지정 X 
		this.id = i; // 우리멤버는 this객체로 찾음. 지역변수와 변수명이 다를 땐 this를 붙이지 않아도 되지만 명시적으로 붙이는 것을 추천. 
//		this.id = id; // 지역변수와 변수명이 같을 때는 꼭 this 객체 붙여주기 (두 개의 id는 다른 것) 
	}
	
	// getter (외부에서 사용)
	public String getId() {
		return this.id;
	}

	public void setName(String n) { // 우리멤버 id와 동일한 데이터 타입, id는 지역 변수 (메소드의 매개변수로 선언), 리턴 타입 지정 X 
		this.name = n; // 우리멤버는 this객체로 찾음. this를 붙이지 않아도 되지만 명시적으로 붙이는 것을 추천. (두 개의 id는 다른 것) 
	}
	
	// getter (외부에서 사용) // 해당 타입으로 반환 
	public String getNmae() {
		return this.name;
	}
	
	public void setKor(double kor) {
		this.kor = kor; 
	}
	
	public double getKor() {
		return this.kor; 
	}

	public double getEng() {
		return eng;
	}

	public void setEng(double eng) {
		this.eng = eng;
	}

	public double getMath() {
		return math;
	}

	public void setMath(double math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}
	
	}
