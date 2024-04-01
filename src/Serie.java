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

        int maxLenghtOfseriesOfAlltime = 0;
        int maxLenghtOfseriesTemp = 0;
        int beginngOfBigestIncreasingSequence = 0;
        int endOfBigestIncreasingSequence = 0;

        int previousNumber = Integer.MIN_VALUE;
        int tempBeginningHolder = -1;
        int numberOfIncreasingSeries=0;

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
                //just beginning of bigesst series
                if (tempBeginningHolder == -1) {
                    tempBeginningHolder = currentNumber;

                }

                // Check if the current increasing sequence is the longest so far
                if (maxLenghtOfseriesTemp > maxLenghtOfseriesOfAlltime) {
                    maxLenghtOfseriesOfAlltime = maxLenghtOfseriesTemp;
                    beginngOfBigestIncreasingSequence = tempBeginningHolder;
                    endOfBigestIncreasingSequence = currentNumber;

                }
            } //either end of ass serie
            else {
                //carefull if we just have inceasing output 1
                numberOfIncreasingSeries++;

                maxLenghtOfseriesTemp = 1;
                tempBeginningHolder = currentNumber;
            }

            // Update the previous number
            previousNumber = currentNumber;
        }
        //carefull if we just have inceasing output 1
        if (numberOfIncreasingSeries==0) numberOfIncreasingSeries=1;


        System.out.println("Max length of increasing series: " + maxLenghtOfseriesOfAlltime);
        System.out.println("Starting number of the longest increasing series: " + beginngOfBigestIncreasingSequence);
        System.out.println("Ending number of the longest increasing series: " + endOfBigestIncreasingSequence);
        int lenght = endOfBigestIncreasingSequence-beginngOfBigestIncreasingSequence;
        System.out.println("length  of the longest increasing series:(diff) " + lenght);
        System.out.println("numbers of increasing series: "+numberOfIncreasingSeries);
    }
}

//kochiktarin addad seri dare baraye seri akharo neshon mide na serfan bozorgtaring serie
//bozorgtarin add bozorgtarin serie
//bigest moshkel ine add badi o neshon mide wtf


//sometimes works not right.
