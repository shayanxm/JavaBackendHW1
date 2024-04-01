import java.util.Scanner;

public class PayCheck {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ENTER INPUT:");
            double givenInputFromKeyboard = scanner.nextDouble();
            double afterTaxValue = 0;

            if (givenInputFromKeyboard < 3000000) afterTaxValue = (givenInputFromKeyboard * 0.95);

            else if (givenInputFromKeyboard >= 3000000 && givenInputFromKeyboard < 6000000)
                afterTaxValue = (givenInputFromKeyboard * 0.9);

            else if (givenInputFromKeyboard >= 6000000) afterTaxValue = (givenInputFromKeyboard * 0.76);

            System.out.println("output:\n" + afterTaxValue);
        }
    }
}
