package java.day3;
import java.util.Arrays;

public class ArrayCopyTest_2 {

	public static void main(String[] args) {
		
		// 깊은 복사 
		int[] source = {1, 2, 3, 4, 5};
		int[] target;
		int[] target2;
		
		target = Arrays.copyOf(source, 3); // source의 3번째 배열보다 작은 값까지 복사 (1, 2, 3) 
		for(int data: target)
			System.out.print(data + " ");
		System.out.println();
		
		// copyOfRange(배열명,n1,n2) : n1 ~ n2 번째 값 복사
		target2 = Arrays.copyOfRange(source,2,6); // 인덱스 값이 없는 경우 기본값인 0으로 지정해서 나온다.
		
		source[2] = 999; // 복사 이후 값 변경 -> target 2에는 영향 X 
		
		for(int data: target2)
			System.out.print(data + "  ");
		System.out.println();
		
	}

}
