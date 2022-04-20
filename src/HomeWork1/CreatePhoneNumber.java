package HomeWork1;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String phoneNumber = "(XXX)XXX-XXXX";
        for (int i : array) {
            phoneNumber = phoneNumber.replaceFirst("X", String.valueOf(i));
        }
        System.out.println(phoneNumber);
    }
}
