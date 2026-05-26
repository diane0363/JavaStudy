import java.util.Scanner;

public class Study1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 생년월일 입력
        System.out.println("태어난 연도 : ");
        int birthYear = sc.nextInt();

        System.out.println("태어난 월 : ");
        int birthMonth = sc.nextInt();

        System.out.println("태어난 일 : ");
        int birthDay = sc.nextInt();

        System.out.println("현재 연도 : ");
        int currentYear = sc.nextInt();

        System.out.println("현재 월 : ");
        int currentMonth = sc.nextInt();

        System.out.println("현재 일 : ");
        int currentDay = sc.nextInt();

        // 나이 계산
        int age = currentYear - birthYear;

        // 만 나이 계산
        if (currentMonth < birthMonth) {
            age--;
        } else if (currentMonth == birthMonth && currentDay < birthDay) {
            age--;
        }

        System.out.println("만 나이: " + age);

        sc.close();

    }
}