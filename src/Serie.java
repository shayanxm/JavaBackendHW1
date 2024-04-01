import java.util.Scanner;

public class Serie {
    public static void main(String[] args) {
//geting input values from user
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER an int:");
        int givenInputFromKeyboard = scanner.nextInt();

        //here get n nummbers
        System.out.println("ENTER " + givenInputFromKeyboard + " nummbers");
        // String nummbersUnSorted = "";
        StringBuilder nummbersUnSortedBuilder = new StringBuilder();
        for (int i = 0; i < givenInputFromKeyboard; i++) {
            int givenNumbbers = scanner.nextInt();
            nummbersUnSortedBuilder.append(givenNumbbers);
            if (i != givenInputFromKeyboard - 1) {
                nummbersUnSortedBuilder.append("-");
            }
        }
        String nummbersUnSortedX = nummbersUnSortedBuilder.toString();
        System.out.println(nummbersUnSortedX);

        int maxLenghtOfseriesOfAlltime = 1;
        int maxLenghtOfseriesTemp = 1;
        int beginngOfBigestIncreasingSequence = 0;
        int endOfBigestIncreasingSequence = 0;

        int previousNumber = Integer.MIN_VALUE;

        // Iterate over each number in the input string
        for (int i = 0; i < nummbersUnSortedX.length(); i++) {
            int currentNumber = 0;

            // Extract the current number from the input string
            StringBuilder concatenated = new StringBuilder();
            while (i < nummbersUnSortedX.length() && nummbersUnSortedX.charAt(i) != '-') {
                concatenated.append(nummbersUnSortedX.charAt(i));
                i++;
            }
            currentNumber = Integer.parseInt(concatenated.toString());

            // Check if the current number is greater than the previous number
            if (currentNumber >= previousNumber) {
                maxLenghtOfseriesTemp++;

                // Check if the current increasing sequence is the longest so far
                if (maxLenghtOfseriesTemp > maxLenghtOfseriesOfAlltime) {
                    maxLenghtOfseriesOfAlltime = maxLenghtOfseriesTemp;
                    beginngOfBigestIncreasingSequence = currentNumber - maxLenghtOfseriesTemp + 1;
                    endOfBigestIncreasingSequence = currentNumber;
                }
            } else {
                maxLenghtOfseriesTemp = 1;
            }

            // Update the previous number
            previousNumber = currentNumber;
        }

        System.out.println("Max length of increasing series: " + maxLenghtOfseriesOfAlltime);
        System.out.println("Starting number of the longest increasing series: " + endOfBigestIncreasingSequence);
        System.out.println("Ending number of the longest increasing series: " + endOfBigestIncreasingSequence);
    }
}

//kochiktarin addad seri dare baraye seri akharo neshon mide na serfan bozorgtaring serie
//bozorgtarin add bozorgtarin serie
//bigest moshkel ine add badi o neshon mide wtf

