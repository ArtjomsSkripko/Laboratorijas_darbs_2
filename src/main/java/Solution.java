import java.util.Arrays;

/**
 * Class Solution. Has one static method - superDigit(long n).
 * Use this method for super digit calculations
 *
 * @author artjoms.skripko
 * @since 1.0
 */
public class Solution {

    static long superDigit(long n){
        char[] charArray = String.valueOf(n).toCharArray();
        final char firstDigit = charArray[0];

        if (charArray.length == 1){
            return Long.valueOf(String.valueOf(firstDigit));
        } else {
            charArray = Arrays.copyOfRange(charArray, 1, charArray.length);
            return superDigit(Long.valueOf(String.valueOf(firstDigit)) + superDigit(Long.parseLong(new String(charArray))));
        }
    }
}
