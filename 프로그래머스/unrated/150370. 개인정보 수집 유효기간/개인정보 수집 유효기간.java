import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        String[] tmp = today.split("\\.");
        int year = Integer.parseInt(tmp[0]);
        int month = Integer.parseInt(tmp[1]);
        int day = Integer.parseInt(tmp[2]);
        int td = (year * 12 * 28) + (month * 28) + day;

        Map<String, Integer> map = new HashMap<>();


        for (int i = 0; i < terms.length; i++) {
            String[] str = terms[i].split(" ");
            map.put(str[0], Integer.valueOf(str[1]));
        }

        String[] arr1 = new String[privacies.length];
        String[] arr2 = new String[privacies.length];

        for (int i = 0; i < privacies.length; i++) {
            String[] arr =  privacies[i].split(" ");
            arr1[i] = arr[0];
            arr2[i] = arr[1];
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            String[] arr = arr1[i].split("\\.");
            int tYear = Integer.parseInt(arr[0]);
            int tMonth = Integer.parseInt(arr[1]);
            int tDay = Integer.parseInt(arr[2]);
            int tTd = (tYear * 12 * 28) + (tMonth * 28) + tDay;


            if (td >= tTd + map.get(arr2[i]) * 28) {
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
