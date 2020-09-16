package written_examination;

import java.util.ArrayList;
import java.util.Scanner;

public class Growingio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList1 = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0;i < n;i++) {
            String string = scanner.next();
            String string2 = scanner.next();
            arrayList1.add(string);
            arrayList2.add(string2);
        }
        for (int i = 0;i < arrayList1.size();i++) {
            String str1 =arrayList1.get(i).toUpperCase();
            String str2 =arrayList2.get(i).toUpperCase();
            if(str1.contains(str2)) {
                result.add("YES");
            } else {
                result.add("NO");
            }
        }
        for (int i = 0;i < result.size();i++) {
            System.out.println(result.get(i));
        }
    }
}
