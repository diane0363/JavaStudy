/*
만나이 계산

** 입력값 오류와 argument 오류
** (feat. Exception은 언제 사용하는가?)
** if-continue / Exception

** 1. void main
** 2. catch(IllegalArgumentException)
** 3. 메소드명 오타
** 4. 출생월일 > 현재월일 => age--;

*/

import java.util.Scanner;

public class Study1_7 {
    public static void main(String[] args) { // **1
        // sc.close() 자동
        try (Scanner sc = new Scanner(System.in);) {
            while (true) {
                try {
                    // 날짜 입력
                    String birth = inputData(sc, "출생일? : ");
                    String today = inputData(sc, "현재일? : ");

                    // 나이 계산
                    int age = calculateAge(birth, today);
                    System.out.println("만 나이 : " + age);

                    break;

                    //
                    // }catch(throwArgumentException e){
                } catch (IllegalArgumentException e) {// **2
                    System.out.println("오류 : " + e.getMessage());
                    System.out.println("다시 입력하세요");
                }
            }
        }

    }

    public static String inputData(Scanner sc, String msg) {
        String date = "";

        // date = System.out.println(msg).sc.next();
        // => Sysout은 return값이 void라서 불가능 ㅋㅋ
        while (true) {
            System.out.println(msg);
            date = sc.next();

            // 입력값 검증
            // Exception(메시지 작성하기~)
            if (!date.matches("[0-9]{8}")) {
                // throw new IllegalArgumentException("날짜는 숫자 8자리여야함");
                System.out.println("날짜는 숫자 8자리여야함");
                continue;
            }
            break;
        }

        return date;
    }

    public static int calculateAge(String birth, String today) { // **3 메소드명 오타

        // argument 검증
        if (birth == null || today == null) {
            throw new IllegalArgumentException("null값");
        }

        if (birth.length() != 8 || today.length() != 8) {
            throw new IllegalArgumentException("8자리 아님");
        }

        if (birth.compareTo(today) > 0) {
            throw new IllegalArgumentException("출생일보다 현재 날짜가 빠름");
        }

        // 나이 계산
        int age = Integer.parseInt(today.substring(0, 4))
                - Integer.parseInt(birth.substring(0, 4));

        if (birth.substring(4).compareTo(today.substring(4)) > 0) { // 생일이 커야 age--
            age--;
        }

        return age;
    }
}