import jdk.nashorn.internal.runtime.FindProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] strings1 = s1.split("\\[");
        String[] strings2 =  strings1[1].split("]");
        String[] strings3 = strings2[0].split(",");
        int [] array = new int[strings3.length];
        for (int i = 0;i < strings3.length;i++) {
            array[i] = Integer.parseInt(strings3[i]);
        }
        System.out.println(findN(array));

    }
    public static int findN(int[] array) {
        List<Integer> list = new ArrayList<>();
        for(int num : array ) {
            if(list.contains(num)) {
                list.remove(new Integer(num));
            } else {
                list.add(num);
            }
        }
        return list.get(0);
    }
}
