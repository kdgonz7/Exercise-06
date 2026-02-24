public class Main {
    public static void main(String[] args) {
        SuperScanner superScanner = new SuperScanner();

        System.out.print("Enter a numeric value: ");
        double numericValue = superScanner.promptDouble("Enter a double-ic value: ");

        System.out.println("You entered: " + numericValue);

        System.out.print("Enter a string: ");
        String stringValue = superScanner.promptString();
        System.out.println("You entered: " + stringValue);

        System.out.print("Enter an integer: ");

        int intValue = superScanner.promptInt("Enter an integer: ");
        System.out.println("You entered: " + intValue);
    }
}
