import java.util.Scanner;

public class bilibili_1 {
    public static void main(String[] args) {
      int[] array = {4,8,6,12};
        System.out.println(cal_max_common_factor (array));

        }
    public static int cal_max_common_factor (int[] L) {
        int max = 0;
        for(int i = 0;i < L.length -1;i++) {
            max = gcd(L[i],L[i+1]);
            L[i + 1] = max;
        }
        return max;
    }
    public static int gcd (int a,int b) {
        int max = 1;
        for(int i = 2;i <= a;i++) {
            if(a % i == 0 && b % i == 0 ) {
                max = i;
            }
        }
        return max;
    }

}
