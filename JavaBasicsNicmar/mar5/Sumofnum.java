public class Sumofnum {
    public static int sumDigits(int n) {
        // Base case: If n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: Add the last digit to the sum of the remaining digits
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345; // Example number
        System.out.println("Sum of digits of " + number + " is: " + sumDigits(number));
    }
}
