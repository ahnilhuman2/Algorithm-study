import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] array = new String[numbers.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });

        for (int i = 0; i < array.length; i++) {
            answer += array[i];
        }
        if (answer.charAt(0) == '0') {
            answer = "0";
        }

        return answer;
    }
}