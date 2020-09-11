import java.util.ArrayList;
import java.util.Scanner;

public class Alibaba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String str = scanner.next();
        for(int i = 0; i < m;i++) {
            arrayList.add(scanner.next());
        }
        int res = 0;
        for(int i = 0;i < m;i++) {
            res += find(str,arrayList.get(i));
        }
        System.out.println(res);
    }

    private static int  find(String str, String s) {
        int flag = 0;
        int index = 0;
        while((index = str.indexOf(s,index)) != -1) {
            index = index + s.length();
            flag++;
        }
        return flag;
    }
}
