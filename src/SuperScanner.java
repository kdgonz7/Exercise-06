import java.util.Scanner;

/// <summary>
/// <h3>SuperScanner</h3>
///
/// The scanner class focuses on:
/// - Prompting user input
/// - Validating numeric inputs
/// - Providing a simple interface for different types of input (numeric, string, integer)
/// </summary>
public class SuperScanner {
    private static Scanner scannerInternal;

    public SuperScanner() {
        scannerInternal = new Scanner(System.in);
    }

    public double promptDouble(String prompt) {
        return promptNumeric(prompt);
    }

    public String promptString() {
        var scanned = scannerInternal.nextLine();

        try {

            var _ = Integer.parseInt(scanned);
            var _ = Double.parseDouble(scanned);

            System.out.println("Please type a string, not a number.");

            return promptString();
        } catch (NumberFormatException e) {
            return scanned;
        }

    }

    public int promptInt(String prompt) {
        double regularInput = promptNumeric(prompt);
        return (int) regularInput; // for sake of simplicity, just cast...
    }

    private double promptNumeric(String prompt) {
        String userInput;

        while (true) {
            try {
                userInput = scannerInternal.nextLine();
                return Double.parseDouble(userInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                System.out.print(prompt);
            }
        }
    }
}