import java.util.ArrayList;
import java.util.Scanner;

public class shunfeng {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            String str = scanner.next();
            String res = "";
            char [] chars = str.toCharArray();
            if(chars[0] == '<') {
                System.out.println(res);
            } else  {
                ArrayList<String> arrayList = new ArrayList<>();
                for (int i = 0;i < chars.length;i++) {
                    arrayList.add(chars[i] + "");
                    if(chars[i] == '<') {
                        arrayList.remove(arrayList.size() -1);
                        arrayList.remove(arrayList.size() -1);
                    }
                }
                for (int i = 0;i < arrayList.size();i++) {
                    res += arrayList.get(i);
                }
                System.out.println(res);
            }
            }

        }
}
