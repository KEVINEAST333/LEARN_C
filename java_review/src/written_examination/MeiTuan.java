package written_examination;

import java.util.Scanner;

public class MeiTuan {
    public static void main(String args[]) {
        int flag = 1;
        int flag2 = 1;
        Scanner scanner = new Scanner(System.in);
        String p = scanner.next();
        String t = scanner.next();
        if(p.equals(t)) {
            System.out.println(1);
        }
        if(p.contains("?")) {
            int index = p.indexOf("?");
            String[] strs = t.split("" + t.charAt(index));
            for(int i = 0;i < strs.length;i++) {
                if(!p.contains(strs[i])) {
                    flag = 0;
                }
            }

        }

        if(p.contains("*")) {
            int index = p.indexOf("*");
            String [] strs2 = p.split("//*");
            for (int i = 0;i < strs2.length;i++) {

                if(i == 1 && !strs2[i].equals(p.substring(0,index))) {
                    flag = 0;
                }
                if(i == strs2.length -1 && !strs2[i].equals(p.substring(0,index))) {
                    flag = 0;
                }
            }
        }
        if(flag == 1 && flag2 == 1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        }
}
