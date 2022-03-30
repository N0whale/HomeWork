package HomeWork2.loops;



public class loops_1_2 {

    public static void main(String[] args) {



        int a = Integer.parseInt(args[0]);

        String y = Integer.toString(a);

        for (int i = 0; i < y.length(); i++)
        {
            if (i < y.length() -1) {

                System.out.print(y.charAt(i) + "*");
            }
            else System.out.print(y.charAt(i));

        }


        System.out.print(" = " + MultiA((int) a));


    }

    static int MultiA(int a) {

        int b = 1;
        int z;

        while (a != 0) {
            z = a % 10;
            b *= z;
            a = a / 10;


        }

        return b;

    }
}