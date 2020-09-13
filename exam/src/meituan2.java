import java.util.Scanner;

public class meituan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        int m =  scanner.nextInt();
        int k =  scanner.nextInt();
        int[] array = new int[n];
        int res = 0;
        for(int i = 0;i < n;i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n;i++) {
            Boolean flag = false;
            for (int j = i;j < m;j++) {
                if(array[j] < k ) {
                    flag = true;
                }
            }

            if(flag == false) {
                res++;
            }
            if(m == n) {
                break;
            }
            if(m < n) {
                m++;
            }
        }
        System.out.println(res);
    }
}
