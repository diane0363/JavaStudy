package java.day3;

public class ArrayTest_2 {

	public static void main(String[] args) {
		// 가변 배열
		// 자바의 2차원 배열은 행의 길이가 달라도 된다! 
		// int[][] temp = {{1, 2}, {1, 2, 3, 5, 7}, {11, 23, 34}};
			// -> 기본값 채움 X 
			
			// 아래의 경우 기본값 채움 O
			// int[][] temp = new int[3][5];  // 
			// temp[0] = new int[]{1,2};      // [1,2,0,0,0] 
		
		int[][] ary = new int[5][5];
		int cnt = 0;
		
		// 입력 
		for(int i = 0 ; i < ary.length ; ++i) {
			for(int j = 0 ; j < ary[i].length ; ++j) {
				ary[i][j] = ++cnt;    	// 가로로 채워진다.
//				ary[j][i] = ++cnt;		// 세로로 채워진다.
			}
		}
		
		// 출력 
		for(int i = 0 ; i < ary.length ; ++i) {
			for(int j = 0 ; j < ary[i].length ; ++j) {
				System.out.printf("%3d", ary[i][j]);
			}
			System.out.println();
		}
	}
}
