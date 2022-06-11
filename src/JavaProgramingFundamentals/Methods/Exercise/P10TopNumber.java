package JavaProgramingFundamentals.Methods.Exercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isSumDigitsDivisibleBy8(i) && isContainsOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isSumDigitsDivisibleBy8(int number) {
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number /= 10;
        }
        return sumDigits % 8 == 0;
    }

    private static boolean isContainsOddDigit(int number) {

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
