public class Main {
    public static void main(String[] args) {
        SuperScanner superScanner = new SuperScanner();
        runTest(superScanner);
    }

    private static void runTest(SuperScanner superScanner) {
        testNumeric(superScanner);
        testString(superScanner);
        testInteger(superScanner);
    }

    private static void testInteger(SuperScanner superScanner) {
        int intValue = superScanner.promptInt("Enter an integer: ");
        System.out.println("You entered: " + intValue);
    }

    private static void testString(SuperScanner superScanner) {
        String stringValue = superScanner.promptString("Enter a string: ");
        System.out.println("You entered: " + stringValue);
    }

    private static void testNumeric(SuperScanner superScanner) {
        double numericValue = superScanner.promptDouble("Enter a double-ic value: ");
        System.out.println("You entered: " + numericValue);
    }
}
