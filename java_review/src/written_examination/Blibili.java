package written_examination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Blibili {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arraylist = new ArrayList<>();
        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        while (scanner.hasNext()) {
            arraylist.add(scanner.next());
        }
        // System.out.println(arraylist.toString());
        int k = new Integer(arraylist.get(arraylist.size() - 1));

        //int end = arraylist.indexOf("#") - 1;
        arraylist.remove(arraylist.size() - 1);
        arraylist.remove(arraylist.size() - 1);
        int j = 0;
        for (int i = 0; i < arraylist.size() / k; i++) {
            int n = 0;
            ArrayList<String> array = new ArrayList<>();
            while (n < k) {
                array.add(arraylist.get(j));
                n++;
                j++;
            }
            Collections.reverse(array);
            arrayLists.add(array);
        }
        String str = "";
        for (int i = 0; i < arraylist.size() / k; i++) {
            for (int h = 0; h < k; h++) {
                str += arrayLists.get(i).get(h) + "->";
            }
        }

        for (int i = j; i < arraylist.size(); i++) {
            if (i == arraylist.size() - 1) {
                str += arraylist.get(i);
            } else {
                str += arraylist.get(i) + "->";
            }

        }
        if (k == 1 || k == arrayLists.size()) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() - 1);
            System.out.println(stringBuilder);
        } else {
            System.out.println(str);
        }
    }
}
