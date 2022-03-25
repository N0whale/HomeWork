package HomeWork1;

public class BitOp2 {

    public static void main(String[] args) {

        int a = -42, b = -15;  // 11010110 и 11110001 в двоичной системе


        int c = a&b;   //11010110 & 11110001 = 11010000

        c = a;

        c&= b; //с присваиванием


        System.out.println("Операция AND (&) чисел -42 и -15 будет равна " + c);


        c = a^b;  //11010110 & 11110001 = 00100111

        c = a;

        c^= b; //с присваиванием


        System.out.println("Операция XOR (^) чисел -42 и -15 будет равна " + c);

        c = a|b;  // 11010110 | 11110001 = 11110111

        c = a;

        c|= b; //с присваиванием


        System.out.println("Операция OR (|) чисел -42 и -15 будет равна " + c);


        System.out.println("Операция NOT (~) числа -42 будет равна " + ~a);  // ~11010110 = 00101001


        System.out.println("Операция NOT (~) числа -15 будет равна " + ~b);  // ~11110001 = 00001110

        c= a<<3; // 11010110 << 3 = 10110000

        c = a;

        c<<= 3; // с присваиванием

        System.out.println("При выполнении сдвига влево на 3 позиции числа -42 получим " + c);

        c = b<<4; // 11110001 << 4 = 00010000

        c = b;

        c<<= 4; // с присваиванием

        System.out.println("При выполнении сдвига влево на 4 позиции числа -15 получим " + c);

        c= a>>4; // 11010110 >> 4 = 11111101

        c = a;

        c>>= 4;  // с присваиванием

        System.out.println("При выполнении сдвига вправо на 4 позиции числа -42 получим " + c);

        c = b>>2; // 11110001 >> 2 = 11111100

        c = b;

        c>>=4; //с присваиванием

        System.out.println("При выполнении сдвига вправо на 2 позиции числа -15 получим " + c);
    }
}
