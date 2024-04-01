import java.util.Scanner;

public class NoBoundrieArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNumOfArrayMembers = 5;
        int[] tempArray = new int[currentNumOfArrayMembers];
        int maxLenghtCounter = 0;
        int biggestCurrentNumber = Integer.MIN_VALUE;
        int secondBiggestCurrentNumber = Integer.MIN_VALUE;
        int smallestCurrentNumber = Integer.MAX_VALUE;
        int smallestDiff = Integer.MAX_VALUE;
        int index = 0; // Index to keep track of where to insert user input

        //till user enters 0
        while (true) {
            System.out.println("ENTER number " + index + " and enter 0 for exiting process");
            int givenInputFromKeyboard = scanner.nextInt();

            // Check if user wants to exit
            if (givenInputFromKeyboard == 0) {
                break;
            }

         //double  size if needed
            if (index >= tempArray.length) {
                currentNumOfArrayMembers = currentNumOfArrayMembers * 2;
                int[] newArray = new int[currentNumOfArrayMembers];
                System.arraycopy(tempArray, 0, newArray, 0, tempArray.length);
                tempArray = newArray;
            }

            // save input in the array and update statistics
            tempArray[index] = givenInputFromKeyboard;
            if (givenInputFromKeyboard < smallestCurrentNumber) smallestCurrentNumber = givenInputFromKeyboard;
            if (givenInputFromKeyboard > biggestCurrentNumber) biggestCurrentNumber = givenInputFromKeyboard;

            index++; // next index
        }
        scanner.close();

        System.out.println(smallestCurrentNumber + "   " + biggestCurrentNumber);
        int biggestDifference = biggestCurrentNumber - smallestCurrentNumber;
        System.out.println("biggest diff:" + biggestDifference);

        // Smallest difference calculator
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                int difference = Math.abs(tempArray[i] - tempArray[j]);
                if (difference < smallestDiff) {
                    smallestDiff = difference;
                }
            }
        }
        System.out.println("smallest diff : " + smallestDiff);
        for (int i = 0;i<tempArray.length;i++){
        System.out.print(tempArray[i]+" , ");}
    }

}
