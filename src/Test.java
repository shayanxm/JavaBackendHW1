public class Test {

        public static void main(String[] args) {
            String input = "2234-4-6234234-88-999-7-6-5-4";
            StringBuilder numStr = new StringBuilder();
            int prevNum = 0;

            for (char c : input.toCharArray()) {
                if (c != '-') {
                    numStr.append(c);
                } else {
                    int currentNum = Integer.parseInt(numStr.toString());
                    System.out.println("Previous number: " + prevNum + ", Current number: " + currentNum);
                    prevNum = currentNum;
                    numStr.setLength(0); // Reset StringBuilder
                }
            }

            // Print the last number after the loop
            int lastNum = Integer.parseInt(numStr.toString());
            System.out.println("Previous number: " + prevNum + ", Current number: " + lastNum);

    }


}
