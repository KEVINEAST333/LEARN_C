package exam;

public class banyu2 {
    public int minFlipsMonoIncr (String s) {
        // write code here
        int result = 0;
        int n = s.length();
        int [] sum = new int[n];
        if(s.charAt(0) == '0') {
            sum[0] = 1;
        } else {
            sum[0] = 0;
        }
        for (int i = 1;i < n;i++) {
            sum[i] = sum[i-1] + (s.charAt(i) == '0' ? 1: 0);
        }
        result = sum[n -1];
        for (int i = 0;i < n;i++) {
            result = Math.min(result,i+1 - sum[i] + sum[n-1] - sum[i]);
        }
        return result;
    }
}
