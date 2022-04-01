package HomeWork2.loops;

public class loops_1_5 {

    public static void main(String[] args) {

        int n2 = 2;
        int n6 = 6;

        printMultNumber(n2);
        System.out.println("---------------------------------------------------------");
        printMultNumber(n6);

    }

    /**
     * @param n
     */
    private static void printMultNumber(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %2d | %2d x %2d = %2d | %2d x %2d = %2d | %2d x %2d = %2d\n", n, i, i * n, n + 1, i, i * (n + 1), n + 2, i, i * (n + 2), n + 3, i, i * (n + 3));
        }
    }
}


