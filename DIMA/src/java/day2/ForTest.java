/*
 * 단일 for문을 이용해서 알파벳 대문자 출력
 * ABC,,,Z
 * 
 */

// 10회 반복하고 싶을때, int num=0; num<10을 해도 되지만, int num=65; num<75;도 같은 의미임, int num=65; num<(num+10);도 가능은 함
// 즉, 횟수를 지정할때 꼭 0부터 할 필요는 없음
package java.day2;

public class ForTest {

	public static void main(String[] args) {
		
		// Z YZ XYZ ,,,
		for(char j = 'Z'; j>= 'A'; --j) {
			for(char i = j; i <= 'Z'; ++i)  // i변수는 for문에 진입할 때 다시 생성
				System.out.print(i);

			System.out.print("  ");               // char i 변수는 for문을 벗어나면 사라짐
		}
		
		System.out.println();
		// A AB ABC ABCD ,,, 
		for(char j = 'A'; j <= 'Z'; ++j) {
			for(char i = 'A'; i <= j; ++i)  // i변수는 for문에 진입할 때 다시 생성
				System.out.print(i);

			System.out.print("  ");               // char i 변수는 for문을 벗어나면 사라짐
		}
		
		
	      for(int num=65 ; num<75 ; ++num ) { // 아래 for문을 몇번 반복할 것인지, {} 안 for문을 다 포함하게   
	    	//1)      for(char num='A'; num<='Z'; ++num){   
	    	//2)       for(char num='Z'; num>='A'; --num){  
	    	         
	    	         for (char ch = 'A'; ch <= 'Z'; ++ch)     // 안에 for문은 하나만 출력하므로 {} 생략 가능 -> ch프린트만 해당 for문에 들어간다!
	    	//1)        for(char ch=num; ch<='Z'; ++ch)     -> for문에 진입할때 다시 초기화 됨, ch 변수는 for문을 벗어나면 사라지므로
	    	//2)        for(char ch=num; ch<='Z'; ++ch)   : Z~Z > Y~Z > ... > A~Z
	    	            
	    	        	 System.out. print(ch);
	    	            
	    	         System.out. println(); // Z까지 찍고 줄바꿈을 의미  // for문 안에 들여쓰기한다고 중요한게 아님! for문의 {} 안에 있냐 없냐가 의미!
	    	      }   
	    	// < for 문 설명 > 
	    	// 출력하는 문장이 한개 밖에 없으므로 {} 생략 가능, for문은 ;이 두개 있어야함
	    	// for(초기식; 조건식; 증가 혹은 감소식 ){           -> 조건식을 통해 true인지 false인지 확인해야함
	    	           // 반복할 문장
	    	//   }
		
	}

}
