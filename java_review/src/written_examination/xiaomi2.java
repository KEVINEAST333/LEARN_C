package written_examination;
import java.util.*;
public class xiaomi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        String str2 = "";
        for(int i = 0;i < chars.length;i++) {
            if(!str2.contains("" + chars[i])) {
                str2 += chars[i];
            }
        }
        System.out.println(str2);
    }
}
