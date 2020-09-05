package written_examination;

import java.util.ArrayList;
import java.util.Scanner;

public class ByteDance {
    //helloo -> hello   AABB -> AAB;
    // woooooooow -> woow AAA -> AA;
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()) {
            ArrayList<String> arraylist = new ArrayList<>();
            ArrayList<String> list = new ArrayList<>();
            int n = scan.nextInt();
            for(int i = 0;i < n;i++) {
                arraylist.add(scan.next());
            }
            for(int j = 0 ;j < n;j++) {
                char[] chars = arraylist.get(j).toCharArray();
                String str = changeStr(chars);
                list.add(str);
            }
            for(int l = 0; l < list.size();l++) {
                System.out.println(list.get(l));
            }
        }
    }
    public static String changeStr(char[] chars) {
        ArrayList<Character> arraylist = new ArrayList<>();
        String str = "";
        for(int k = 0; k < chars.length;k++) {
            arraylist.add(chars[k]);
        }
        int i = 0;
        while( i < arraylist.size() - 2) {
            if ((arraylist.get(i) == arraylist.get(i + 1)) && (arraylist.get(i + 1) == arraylist.get(i + 2))) {
                arraylist.remove(i + 2);
                //System.out.println(arraylist.toString());
            } else {
                i++;
            }
        }
        int j = 0;
        while( j < arraylist.size() - 3 ) {
            if((arraylist.get(j) == arraylist.get(j + 1))&&  (arraylist.get(j + 2) == arraylist.get(j + 3))) {
                arraylist.remove(j+3);
            } else {
                j++;
            }
        }
        for(int k = 0; k < arraylist.size();k++) {
            str = str + arraylist.get(k);
        }
        return str;
    }
}
