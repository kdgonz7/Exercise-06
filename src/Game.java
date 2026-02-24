import java.util.regex.Pattern;

public class Game {
    public static void main(String[] args) {
        assert (isANumber("15.3"));
        assert (isANumber("6"));
        assert (!isANumber("Apples"));
        assert (isPhoneNumber("689-288-4318"));
        assert (isPhoneNumber("(+1) 123-456-7890"));
        assert (isValidEmail("a@gmail.com"));
    }

    public static boolean isANumber(String givenInput) {
        var match = Pattern.compile("^-?\\d+(\\.?\\d+)?$").matcher(givenInput);
        return match.matches();
    }

    public static boolean isPhoneNumber(String givenInput) {
        var match = Pattern.compile("(\\+ \\d)?\\d{3}-\\d{3}-\\d{4}").matcher(givenInput);
        return match.matches();
    }

    public static boolean isValidEmail(String givenInput) {
        var match = Pattern.compile("^([a-zA-z0-9])+@([a-zA-Z0-9])+(\\.[a-zA-Z0-9]+)+$").matcher(givenInput);
        return match.matches();
    }

}
