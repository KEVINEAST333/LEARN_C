package written_examination;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ByteDance3 {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 13; i++) {
            array.add(scan.nextInt());
        }
        //System.out.println(array.toString());
        for (int i = 1; i < 10; i++) {
            array.add(i);
            Collections.sort(array);
            //符合删除
            int j = 0;
            while (j < array.size() - 2) {
                int a = array.get(j);
                int b = array.get(j + 1);
                int c = array.get(j + 2);
                if ((a == b && b == c) || (a + 1 == b && b + 1 == c)) {
                    array.remove(j);
                    array.remove(j);
                    array.remove(j);
                } else {
                    j += 3;
                }

            }
            if ((array.size() == 2) && (array.get(0).equals(array.get(1)))) {
                result.add(i);
            }
            array.remove(i);
        }
        String str = "";
        for (int i = 0; i < result.size(); i++) {
            str += result.get(i) + " ";
        }
        System.out.println(str);

    }
}
