import java.util.Arrays;
import java.util.Scanner;

public class cm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String[] strings1 = s1.split("\\[");
        String[] strings2 =  strings1[1].split("]");
        String[] strings3 = strings2[0].split("，");
        int [] array = new int[strings3.length];
        for (int i = 0;i < strings3.length;i++) {
            array[i] = Integer.parseInt(strings3[i]);
        }
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        int result = 0;
        int a = array[0];
        for (int i = 0;i < array.length;i++) {
            if(array[i] != a) {
                //System.out.println(a);
                result = a;
                break;
            }
            a++;
        }
        System.out.println(result);
    }
}
