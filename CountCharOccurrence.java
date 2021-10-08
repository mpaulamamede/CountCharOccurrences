import java.util.Scanner;

public class CountCharOccurrence {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        char aChar = input.next().charAt(0);

        countOccurr(string, aChar);

    }

    private static void countOccurr(String string, char aChar) {

        if (string != null && string.length() != 0) {
            int occurr = 0;

            for (char c : string.toCharArray()){

                if (c == aChar) occurr++;
            }

            System.out.println(occurr);
        } else System.out.println(0);
    }
}
