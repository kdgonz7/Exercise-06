import java.util.Scanner;
import java.util.regex.Pattern;

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

    public static boolean isANumber(String givenInput) {
        var match = Pattern.compile("^-?\\d+(\\.?\\d+)?$").matcher(givenInput);
        return match.matches();
    }

    public String promptString(String prompt) {
        System.out.println(prompt);
        var scanned = scannerInternal.nextLine();

        if (isANumber(scanned)) {
            System.out.println("Invalid input. Please enter a string.");
            return promptString(prompt);
        }

        return scanned;
    }

    public double promptDouble(String prompt) {
        System.out.println(prompt);
        var scanned = scannerInternal.nextLine();

        if (!isANumber(scanned)) {
            System.out.println("Invalid input. Please enter a numeric value.");
            return promptDouble(prompt);
        }

        return Double.parseDouble(scanned);
    }

    public int promptInt(String prompt) {
        System.out.println(prompt);
        var scanned = scannerInternal.nextLine();

        if (!isANumber(scanned)) {
            System.out.println("Invalid input. Please enter an integer.");
            return promptInt(prompt);
        }

        return Integer.parseInt(scanned);
    }
}