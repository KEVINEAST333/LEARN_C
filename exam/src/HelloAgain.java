import java.util.Scanner;

public class HelloAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String a = scanner.next();
            if ("1".equals(a)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
