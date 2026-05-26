import java.util.Scanner;

public class Study1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("생년월일(8자리 입력): ");
        // int birth = sc.nextInt();
        String birth = sc.next();

        System.out.println("현재 날짜(8자리 입력): ");
        String current = sc.next();

        // if (birth.length() != 8 || today.length() != 8) {
        // System.out.println("날짜는 8자리로 입력해야 합니다.");
        // return;
        // }

        // if (!birth.matches("[0-9]+") || !today.matches("[0-9]+")) {
        // System.out.println("날짜는 숫자만 입력해야합니다.");
        // return;
        // }

        // validation check
        if (!birth.matches("[0-9]{8}") || !current.matches("[0-9]{8}")) {
            System.out.println("8자리 숫자만 입력해야합니다.");
            sc.close();
            return;
        }

        int birthYear = Integer.parseInt(birth.substring(0, 4));
        int birthMonth = Integer.parseInt(birth.substring(4, 6));
        int birthDay = Integer.parseInt(birth.substring(6, 8));

        int currentYear = Integer.parseInt(current.substring(0, 4));
        int currentMonth = Integer.parseInt(current.substring(4, 6));
        int currentDay = Integer.parseInt(current.substring(6, 8));

        int age = currentYear - birthYear;

        if (currentMonth < birthMonth) {
            age--;
        } else if (currentMonth == birthMonth && currentDay < birthDay) {
            age--;
        }

        System.out.println("만 나이: " + age);

        sc.close();
    }
}
