import java.util.Scanner;

public class dada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sou = scanner.next();
        String tar = scanner.next();
        char[] chars = sou.toCharArray();
        char[] chart = tar.toCharArray();
        for (int i = 0;i < chart.length;i++) {
             Boolean flag = false;
            for (int j =0;j < chars.length;j++) {
                if(chars[j] == chart[i]) {
                    flag = true;
                }
            }
            if(!flag) {
                System.out.println(chart[i]);
                break;
            }
        }
    }
}
