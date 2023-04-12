import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = arr[0]; i > 0; i--) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    count++;
                }
            }
            if (count >= i) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}