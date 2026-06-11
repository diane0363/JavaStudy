public class ContinueTest {
    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            if ((i % 2) == 0) {
                i++; // continueするとi++が実行されないため、無限ループになる
                continue;
            }
            if ((i + 2) > 6) {
                System.out.println("break! (i=" + i + ")");
                break;
            }

            System.out.println(i);
            i++;
        }

        System.out.println("loop finished. i=" + i);
    }

}
