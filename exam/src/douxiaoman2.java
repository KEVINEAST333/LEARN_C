import java.util.Scanner;

public class douxiaoman2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arrays = new int[n][m];
        if(m >= n) {
            System.out.println("No solution");
        }
        System.out.println(n*2- 2);
    }
}
