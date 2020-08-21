package written_examination;

import java.util.Scanner;

public class yuan {
/*    输入
3 3
        1 2 3
        4 5 6
        7 8 9
    输出
1 4 7 8 9 6 3 2 5*/
//逆序遍历二维数组
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = scanner.nextInt();
    if(n == 0 || m == 0) {
        return;
    }
    int[][] arrays = new int[n][m];
    for (int i = 0; i < n;i++) {
        for (int j = 0;j < m;j++) {
            arrays[i][j] = scanner.nextInt();
        }
    }
    int up = 0;
    int down = n - 1;
    int left = 0;
    int right = m - 1;
    int num = n * m;
    while(num >= 1) {
        //第一竖列
        for (int i = up;i <= down && num >= 1;i++) {
            System.out.print(arrays[i][left] + " ");
            num--;
        }
        left++;
        for (int i = left;i <= right && num >= 1;i++) {
            System.out.print(arrays[down][i] + " ");
            num--;
        }
        down--;
        for (int i = down;i >= up && num >= 1;i--) {
            System.out.print(arrays[i][right]+" ");
            num--;
        }
        right--;
        for (int i = right;i >= left && num >= 1;i--) {
            System.out.print(arrays[up][i] + " ");
            num--;
        }
        up++;
    }
}
}
