package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {
        int result = 0;
        if (input == null || input.length() < 1) {
            return -1;
        }
        for (char letter : input.toCharArray()) {
            if (letter > 47 && letter < 58) {
                result += letter - 48;
            }
        }
        return result;
    }
}
