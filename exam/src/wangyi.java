import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class wangyi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int j = 0;j < a;j++) {
            ArrayList<String> arrayList = new ArrayList<>();
            int [][] arrays = new int[n][n];
            for (int i = 0;i <= k;i++) {
                String s = scanner.nextLine();
                arrayList.add(s);
            }
            // System.out.println(arrayList.toString());
            //生成矩阵
            int left = 0;
            int right = n-1;
            int up = 0;
            int down = n-1;
            int m = 0;
            int flag = 0;
            while (left <= right) {
                while(left <= right && flag == 0) {
                    //第一行
                    for (int i = left ;i <= right;i++) {
                        arrays[up][i] = ++m;
                    }
                    up++;
                    //左边一行
                    for (int i = up;i <= down;i++) {
                        arrays[i][right] = ++m;
                    }
                    right --;
                    for (int i = right;i >= left;i--) {
                        arrays[down][i] = ++m;
                    }
                    down--;
                    for (int i = down;i >= up;i--) {
                        arrays[i][left] = ++m;
                    }
                    left++;
                    flag = 1;
                }
                while(left <= right && flag == 1) {
                    //第一行
                    for (int i = up ;i <= down;i++) {
                        arrays[i][left] = ++m;
                    }
                    left++;
                    //左边一行
                    for (int i = left;i <= right;i++) {
                        arrays[down][i] = ++m;
                    }
                    down --;
                    for (int i = down;i >= up;i--) {
                        arrays[i][right] = ++m;
                    }
                    right--;
                    for (int i = right;i >= left;i--) {
                        arrays[up][i] = ++m;
                    }
                    up++;
                    flag = 0;
                }
            }
            for (int i = 1;i <arrayList.size();i++) {
                String[] strs  = arrayList.get(i).split(" ");
                int x = Integer.parseInt(strs[0]);
                int y  = Integer.parseInt(strs[1]);
                System.out.println(arrays[x][y]);
            }
      /*  for (int i = 0;i < n;i++) {
            System.out.println(Arrays.toString(arrays[i]));
        }
*/
        }

    }
}
