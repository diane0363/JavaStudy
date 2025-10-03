
public class OperateTest2 {

	public static void main(String[] args) {
		// 단항 연산자 ( ++ (increment) -- (decrement) ) : 1을 증감시키는 연산자. 
	// ***** 피연산자는 변수 *****
	int a = 0;
	int b = 0;
	
	b = ++a; // ++는 2순위 -> 증가 후 대입
	System.out.println(a + "/" + b);        // 1 / 1
	

	a = 0;
	b = 0;
	
	b = a++; // ++는 14순위 -> 대입 후 증가 
	System.out.println(a + " / " + b);      // 1 / 0
	
	a = a + 1;
	a = 10 - 9;
//		0++;  // ++은 Literal 에 붙을 수 X 피연산자는 무조건 변수여야함 
		
		
		
	}

}
