import java.lang.reflect.Array;
import java.util.Arrays;

public class lichen {
    public static int[] func1 (int[][] order_list, int n) {
        if(order_list.length == 0 || n == 0) {
            return null;
        }
        int [][] array = new int[n+1][2];
        for(int i = 0;i < order_list.length;i++) {
            int k = 0;
            for (k = order_list[i][0] ; k <= order_list[i][1];k++) {
                array[k][0] = k;
                array[k][1] += order_list[i][2];
            }
        }
        int [] result = new int[n];
        for (int i = 0;i < n;i++) {
            result[i] = array[i][1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{2,4,10},{0,3,15},{3,4,21}};
        System.out.println(Arrays.toString(func1(array, 6)));
    }
}
