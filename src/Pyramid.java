import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ENTER INPUT:");
            int givenInputFromKeyboard = scanner.nextInt();

            // Loop for each line of the pyramid
            for (int i = 0; i < givenInputFromKeyboard; i++) {

                // Loop for printing spaces before stars
                for (int j = 0; j < givenInputFromKeyboard - i - 1; j++) {
                    System.out.print(" ");
                }

                // Loop for printing stars
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }

                System.out.println();
            }
            System.out.println();
        }
    }


}
