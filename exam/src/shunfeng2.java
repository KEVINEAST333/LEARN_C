import java.util.Scanner;
public class shunfeng2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            int n = scanner.nextInt();
            int max = getMax(n);
            System.out.println(max);
        }

    }

    private static int getMax(int n) {
        if(n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
        if(n == 4) {
            return 4;
        }
        int max = 1;
        while(n > 4) {
            max *= 3;
            n -= 3;
        }
        max *= n;
        return max;
    }
}
