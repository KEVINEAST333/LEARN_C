import java.util.HashMap;
import java.util.Scanner;

public class iqiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        System.out.println(getLength(str));
    }
    private static int  getLength(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int res = 1;
        int a = 1;
        hashMap.put(str.charAt(0),0);
        for (int i = 1;i < str.length();i++) {
            if(hashMap.containsKey(str.charAt(i))) {
                int b = i - hashMap.get(str.charAt(i));
                if(b < a+1) {
                    a = b;
                } else {
                    a += 1;
                }
                hashMap.put(str.charAt(i),i);
            }  else {
                a += 1;
                hashMap.put(str.charAt(i),i);
            }
            if(a > res) {
                res = a;
            }
        }
        return res ;
    }
}
