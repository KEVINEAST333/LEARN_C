import java.util.Scanner;

public class duxiaoman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        for(int i = 1;i <= 3*n;i++) {
           sum += m*i;
        }
        System.out.println(sum);
    }
}
