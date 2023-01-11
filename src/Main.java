public class Main {
    public static void main(String[] args) {
        // Prints the factors of 6.
        printFactors(6);

        // Prints the factors of 32.
        printFactors(32);

        // Prints the factors of 10.
        printFactors(10);

        // Prints the factors of -1.
        printFactors(-1);
    }

    /**
     * Prints the factors of a number.
     */
    public static void printFactors(int number) {
        // Checks for invalid value.
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        // Prints the factors.
        for (int i = 1; i <= number; i++) {
            if (number %  i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}