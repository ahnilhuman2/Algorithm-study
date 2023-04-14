import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        int[] answer = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {
            int target = progresses[i];
            int cnt  = 0;

            while (target < 100) {
                target += speeds[i];
                cnt++;
            }
            queue.offer(cnt);
        }

        int idx  = 0;
        while (!queue.isEmpty()) {
            int target = queue.poll();
            int cnt = 1;

            while (!queue.isEmpty() && queue.peek() <= target) {
                queue.poll();
                cnt++;
            }
            answer[idx] = cnt;
            idx++;
        }
        int[] result = new int[idx];
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] != 0) {
                result[i] = answer[i];
            }
        }

        return result;
    }
}