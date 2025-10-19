// 콘솔 메뉴창 만들기
package java.day3;


import java.util.Scanner;

public class MethodTest_2 {

   public static void main(String[] args) {
      Scanner keyin = new Scanner(System.in);
      String choice;  // int로 하면 더 많은 에러 발생 가능
      
      while(true) { 
         menu();  // 아래 menu를 출력시킴 
         choice = keyin.next();
         
         switch(choice) {       // switch 는 문장과 식 둘다 있음
         case "1" : 
        	 regist();
        	 break;
         case "2" : 
        	 retrieve(); 
        	 break;
         case "3" : 
        	 delete(); 
        	 break;
         case "4" : 
        	 update(); 
        	 break;
         case "0" : 
            System.out.println(" **프로그램을 종료합니다."); 
            System.exit(0);
            
         default :  // 0~4번 외 번호를 선택한 경우 
            System.out.println("err >> 메뉴 선택을 다시하세요."); 
         }
      }
      
   }
public static void menu() {    // 반환타입이 없으므로 return이 필요 없고, {} 가 return 역할 대신함 
      System.out.println("=== [회원 관리] ==="); 
      System.out.println("    1) 회원 등록 "); 
      System.out.println("    2) 회원 조회 "); 
      System.out.println("    3) 회원 탈퇴 "); 
      System.out.println("    4) 회원정보 수정 "); 
      System.out.println("    0) 종료 "); 
      System.out.print("      선택하시오:  ");
// public static void menu(int a, int b) 에서 int a, int b : 지역변수인데, 해당 구간 지나면 메모리에서 사라짐      
   }

   public static void regist() {
 	  System.out.println("등록 메뉴 선택함");
   }
   
   public static void retrieve() {
	   System.out.println("조회 메뉴 선택함");
   }

   public static void delete() {
	   System.out.println("탈퇴 메뉴 선택함");
   }
   private static void update() {
	   System.out.println("수정 메뉴 선택함");
	
   }

}