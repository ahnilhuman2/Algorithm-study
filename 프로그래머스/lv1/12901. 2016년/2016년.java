class Solution {
    public String solution(int a, int b) {
        String[] week = {"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int[] month = {0,31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int date = 0;

        for (int i = 1; i < a; i++) {
            date += month[i];
        }
        date = date + b;
        return week[date % 7];
    }
}