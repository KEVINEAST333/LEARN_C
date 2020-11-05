import java.util.Scanner;

public class bainlifeng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int [][] arrays = new int[k][n];
        int sum = 0;
        for(int i = 0;i < k ;i++) {
            for (int j = 0;j < n;j++) {
                arrays[i][j] = j+1;
            }
        }
    }
}
