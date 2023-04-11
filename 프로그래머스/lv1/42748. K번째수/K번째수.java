import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int s = commands[i][0] - 1;
            int e = commands[i][1] - 1;
            int idx = commands[i][2] - 1;

            int[] array2 = Arrays.copyOfRange(array, s, e + 1);
            Arrays.sort(array2);
            answer[i] = array2[idx];
        }
        return answer;
    }
}