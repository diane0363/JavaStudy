package java.day3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		for (int x : a)  x++;   // x는 값 복사본(프리미티브). a는 그대로.

		for (int i = 0; i < a.length; i++) a[i]++; // primitive 값 변경 가능 

//		for (Person p : people) { p.age++; } // p가 가리키는 객체의 필드는 변경됨

		List<Integer> list = new ArrayList<>(a.length);
		for (int x : a) list.add(x);  // 오토박싱 WrapperTest_01 참고
		

		// 순회 중 안전한 삭제 불가 
		// 컬렉션 요소를 제거하려면 for-each 대신 Iterator의 remove() 사용해야함
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
		    if (it.next() < 0) it.remove();
		    // remove는 직전 반환 요소만 제거 가능 
			  // 연속 두 번 remove() 불가, 먼저 next() 필요
			  // .next() 는 현재 가리키는 원소를 반환하면서 내부 커서를 다음 칸으로 전진
						 // -> i++ 와 같은 증가식이 필요없다.
		}

	}
}
