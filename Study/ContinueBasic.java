public class ContinueBasic {

    public static void main(String[] args) {
        example1_skipEvenNumbers();
        System.out.println();

        example2_continueInFor_updateRuns();
        System.out.println();

        example3_nestedLoops_labeledContinue();
    }

    // 1) 가장 기본: 짝수는 스킵하고 홀수만 출력
    private static void example1_skipEvenNumbers() {
        System.out.println("[1] skip even numbers");

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 아래 출력 스킵
            }
            System.out.println("odd = " + i);
        }
    }

    // 2) for에서 continue면 '증감식(update)'이 실행된다는 걸 확인
    private static void example2_continueInFor_updateRuns() {
        System.out.println("[2] for-continue: update still runs");

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                System.out.println("hit continue at i=2");
                continue; // 여기서 i++(update) 실행 후 조건식으로 감
            }
            System.out.println("i = " + i);
        }
    }

    // 3) 중첩 루프에서 특정 조건이면 바깥 루프의 다음 반복으로 넘기기(라벨 continue)
    private static void example3_nestedLoops_labeledContinue() {
        System.out.println("[3] labeled continue");

        OUTER: for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == 2 && col == 2) {
                    System.out.println("skip row=2 entirely");
                    continue OUTER;
                }
                System.out.print("(" + row + "," + col + ") ");
            }
            System.out.println();
        }
    }
}