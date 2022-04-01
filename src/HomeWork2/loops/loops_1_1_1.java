package HomeWork2.loops;

public class loops_1_1_1 {

    public static void main(String args[]) {


        Long x = Long.parseLong(args[0]);

        if (x < 0 | x > 20) {
            System.out.println("Надо ввести целое число больше нуля и меньше 21");
        } else {
            long a = 1;
            for (int i = 1; i <= x; i++) {
                a *= i;

                String otvet = String.format("%d*", i);
                String otvet1 = String.format("%d", i);

                if (i < x) {
                    System.out.print(otvet);
                } else
                    System.out.print(otvet1);
            }
            System.out.println(" = " + a);
        }
    }
}
