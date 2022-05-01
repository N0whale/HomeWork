package HomeWork2.loops;

public class loops_1_1_1 {

    public static void main(String[] args) {
       long x = 10;
        System.out.println(factorial(x));
        }

    public static String factorial(long a){
        StringBuilder result = new StringBuilder();
        if (a <= 0){
            result = new StringBuilder("Введите целое положительное число");
        }
        long b = 1;
        for (int i = 1; i <= a ; i++) {
            b *= i;
            if (b < 0){
                result = new StringBuilder("Произошло переполнение");
                break;
            }
            if (i < a) {
                result.append(i).append(" * ");
            } else
                result.append(i).append(" = ").append(b);
            }
        return String.valueOf(result);
    }
}
