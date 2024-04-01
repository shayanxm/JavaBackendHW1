import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempNumber = 0;

        while (true) {
            System.out.println("ENTER INPUT:");

            int givenInputFromKeyboard = scanner.nextInt();
            while (givenInputFromKeyboard != 0) {
                int lastDigit = givenInputFromKeyboard % 10;

                tempNumber = tempNumber * 10 + lastDigit;
                givenInputFromKeyboard = givenInputFromKeyboard / 10;
            }

            System.out.println(tempNumber);

            tempNumber = 0;
        }
    }
}