package viikko1;
//Palauta luvut nousevassa järjestyksessä

import java.util.Arrays;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[0] + "," + numbers[1] + "," + numbers[2];
        }
}
