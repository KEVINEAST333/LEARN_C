import jdk.nashorn.internal.runtime.FindProperty;

import java.util.ArrayList;
import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String m = scanner.nextLine();
        String a = scanner.nextLine();
        String t = scanner.nextLine();
        String str = "";
        String[] strings = a.split(",");
        for(int n = 0; n < strings.length;n++) {
            String[] strs = strings[n].split(" ");
            ArrayList<String> arrayList = Find(m);
            for (int i = 0; i < strs.length; i++) {
                for (int j = 0; j < arrayList.size(); j++) {
                    if (strs[i].equals(arrayList.get(j))) {
                        strs[i] = t;
                    }
                }
            }
            for (int i = 0; i < strs.length; i++) {
                if(i == strs.length -1 && n!= strings.length -1) {
                    str += strs[i] + ",";
                }
               else {
                    str += strs[i] + " ";
                }
            }
        }
        System.out.println(str);
    }
    private static ArrayList<String> Find(String str) {
        if(str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return  base;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);
        ArrayList<String> prevRes = Find(rest);
        ArrayList<String> Res = new ArrayList<>();
        for(String s : prevRes) {
            for (int i = 0;i <= s.length();i++) {
                String f = s.substring(0,i) + ch + s.substring(i);
                if(!isPresent(f,Res)) {
                    Res.add(f);
                }
            }
        }
        return Res;
    }
    private static boolean isPresent(String s,ArrayList<String> Res) {
        for(String str : Res) {
            if(str.equals(s)) {
                return true;
            }
            }
        return false;
        }
    }
