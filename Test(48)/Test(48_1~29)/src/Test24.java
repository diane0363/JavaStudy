// 아래의 배열 이용 (2차원 배열)
	// int exp[] = new int[5];
	// int result[][] = new int[4][5];

// 이중 while문 이용

// 4행 5열의 정수와 1차원 정수를 선언하고 
// 행과 열이 만나는 위치의 지수값을 구하여 출력하시오 


// 1차 --------------------------------------------------(while문 5개 이용)

//public class Test24 {
//	public static void main(String[] args) {
//
//		 int exp[] = new int[5];
//		 int result[][] = new int[4][5];
//		
//		 int i=0;
//		 while (i < 5) {
//			 exp[i] = i+1;
//			 i++;
//		 }
//		 
//		 
//		 i = 0;
//		 int j=0;
//		 while (i<5) {
//			 j=0;
//			 while (j<4) {
//				 if (i == 0) {
//					 result[j][i] = j+2;
//					 j++;
//				 } else {
//					 result[j][i] = (int) Math.pow(exp[i], result[j][0]);
//					 j++;
//				 }
//			 }
//			 i++;
//		 }
//		 
//		 
//		 i = 0;
//		 while (i < 5) {
//			 System.out.printf("%d\t",exp[i]);
//			 j = 0;
//			 while (j < 4) {
//				 System.out.printf("%d\t",result[j][i]);
//				 j++;
//			 }
//			 System.out.println();
//			 i++;
//		 }	 
//	}
//}	 
//		 		 
//		 


// 2차 ----------------------------------------------(while문 2개 이용)
public class Test24 {
	public static void main(String[] args) {

		 int exp[] = new int[5];
		 int result[][] = new int[4][5];
		
		 
		 int i = 0;
		 int j=0;
		 while (i<5) {
			 exp[i] = i+1;
			 System.out.printf("%d\t",exp[i]);
			 j=0;
			 while (j<4) {
				 if (i == 0) {
					 result[j][i] = j+2;
					 System.out.printf("%d\t",result[j][i]);
					 j++;
				 } else {
					 result[j][i] = (int) Math.pow(exp[i], result[j][0]);
					 System.out.printf("%d\t",result[j][i]);
					 j++;
				 }
			 }
			 System.out.println();
			 i++;
		 }
		 
		 
	}
}	 
		 		 
		 

