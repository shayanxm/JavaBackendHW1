import java.sql.Array;
import java.util.Scanner;

public class NoBoundrieArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tempArray = new int[5];
        int maxLenghtCounter = 0;
        int biggestCurrentNumber = Integer.MIN_VALUE;
        int secondBiggestCurrentNumber = Integer.MIN_VALUE;
        int smallestCurrentNumber = Integer.MAX_VALUE;
        int smallestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < tempArray.length; i++) {
            //   System.out.println("ENTER  "+i+"  :");
            System.out.println("ENTER number " + i + " and enter X for exiting process");

            //    Character exitParameter = scanner.next().charAt(0);
            //if (exitParameter == 'x') break;
            maxLenghtCounter++;
            //time to extend our array
            if (maxLenghtCounter > tempArray.length) {

            } else {
                //temp array is enough
                int givenInputFromKeyboard = scanner.nextInt();
                tempArray[i] = givenInputFromKeyboard;
                if (tempArray[i] < smallestCurrentNumber) smallestCurrentNumber = tempArray[i];
                if (tempArray[i] > biggestCurrentNumber) biggestCurrentNumber = tempArray[i];


            }

        }
        System.out.println(smallestCurrentNumber + "   " + biggestCurrentNumber);
        int biggestDifrence = biggestCurrentNumber - smallestCurrentNumber;
        System.out.println("biggest diff:" + biggestDifrence);

        //smallest diff calculator
        //evrey number sub evreynummber
        for (int i = 0; i < tempArray.length; i++) {
            for (int j = i + 1; j < tempArray.length; j++) {
                // Calculate the absolute difference between the current pair of numbers
                int difference = Math.abs(tempArray[i] - tempArray[j]);

                // Update the minimum difference if the current difference is smaller
                if (difference < smallestDiff) {
                    smallestDiff = difference;
                }
            }
        }
        System.out.println("smallest diff : " + smallestDiff);
        // 1 8 19 55 41 22


    }
}
