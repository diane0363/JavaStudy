package java.day3;

public class ArrayObjectTest_1 {

	public static void main(String[] args) {
		int[] iary = new int[10];        // 0으로 초기화
		String[] s = new String[10];     // null로 초기화 
		s[0] = "돼지국밥";
		s[1] = "샌드위치";
		s[2] = "짜장면";
		
		// for문 1 (구버전)
			// 인덱스가 필요할 때 사용
//		for(int i = 0; i < s.length; ++i)
//			System.out.println(s[i]);
		
		// for문 2 (신버전) (배열만을 위해 생긴 for문, enhanced for 문, 혹은 for-each) (배열(String[] arr)과 컬렉션(iterable - List<>, Set<>)을 순회할 때)
		// 인덱스의 모든 요소 순회 
		// Map 의 경우 Iterable 이 아니기 때문에 entrySet() / values() 를 꺼내서 순회
		// for (요소타입 변수명 : 배열또는컬렉션명) {} 
		// primitive의 경우 값 변경 불가 (인덱스 for문 사용해야함)
		// 참조형의 경우 참조가 가리키는 객체의 내부 상태 변경은 가능 
		for(String str : s) 	System.out.println(str);	
			// s는 문자열 배열, 데이터는 3개 -> 해당 문자열 데이터를 차례대로 꺼내온다. 
			
	}
}