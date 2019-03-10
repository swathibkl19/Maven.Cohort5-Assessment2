package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {

        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String new_word = "";
        for (int i = 1; i <= numberOfTimeToRepeat; i++) {
            if (i <= numberOfTimeToRepeat)
                new_word = new_word + stringToBeRepeated;
            else
                new_word += new_word;
        }
        return new_word;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

        return string.matches("[a-zA-z ]+");

//        for (int i = 0; i < string.length(); i++) {
//            char c = string.charAt(i);
//            if(!(Character.isLetter(c) || c == ' ')) {
//                return false;
//            }
//        }
//
//        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {

        if (string.matches("[a-zA-Z0-9]+")) {
            return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        return string.matches(".*[&*{}()]+.*");

    }
}