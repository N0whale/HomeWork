package HomeWork1;

public class BitOp1 {

    public static void main(String[] args) {

        int a = 42, b = 15;  // 00101010 и 00001111 в двоичной системе



        int c = a&b;   //00101010 & 00001111 = 00001010

        c = a;

        c&=b; // та же операция, но с присваиванием


        System.out.println("Операция AND (&) чисел 42 и 15 будет равна " + c);


        c = a^b;  //00101010 & 00001111 = 00001010

        c = a;

        c^=b;


        System.out.println("Операция XOR (^) чисел 42 и 15 будет равна " + c);

        c = a|b;  // 00101010 | 00001111 = 00101111

        c = a;

        c|=b; // та же операция, но с присваиванием


        System.out.println("Операция OR (|) чисел 42 и 15 будет равна " + c);


        System.out.println("Операция NOT (~) числа 42 будет равна " + ~a);  // ~00101010 = 11010101


        System.out.println("Операция NOT (~) числа 15 будет равна " + ~b);  // ~00001111 = 11110000

        c= a<<3; // 00101010 << 3 = 01010000

        c = a;

        c<<=3; //с присваиванием

        System.out.println("Результат сдвига влево на 3 позиции числа 42 будет равняться " + c);

        c = b<<4; // 00001111 << 4 = 11110000

        c = b;

        c<<=4; //с присваиванием

        System.out.println("При сдвиге влево на 3 позиции числа 15 получим " + c);

        c= a>>4;  // 00101010 >> 4 = 00000010

        c = a;

        c>>= 4; // с присваиванием

        System.out.println("При выполнении сдвига вправо на 4 позиции числа 42 получим " + c);

        c = b>>2; // 00001111 >> 2 = 00000011

        c = b;

        c>>=2; //с присваиванием

        System.out.println("При выполнении сдвига вправо на 2 позиции числа 15 получим " + c);


        c = a>>>5; // 00101010 >>> 5 = 00000001

        c = a;

        c>>>= 5; //с присваиванием


        System.out.println("При выполнении сдвига вправо с заполнением на 5 позиций числа 42 получим "  +c);

        c = b>>>3; //00001111 >>>> 3 = 00000001

        c = b;

        c>>>= 3; // с присваиванием


        System.out.println("При выполнении сдвига вправо с заполнением на 3 позиции числа 15 получим "  +c);









    }
}