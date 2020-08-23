package sword_point_offer;

import java.util.Arrays;

public class reOrderArr {
    public static void reOrderArray2(int [] array) {
        int i = 0;
        int j = array.length -1;
        while(j > i) {
            //奇数不管
            while(array[i]%2 != 0&&j > i) {
                i++;
            }
            //偶数不管
            while(array[j]%2 == 0&&j > i) {
                j--;
            }
            if(i < j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
        }
    }
    public static void reOrderArray(int [] array) {
        //相对位置不变，稳定性
        //插入排序的思想
        int m = array.length;
        int k = 0;//记录已经摆好位置的奇数的个数
        for (int i = 0; i < m; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > k) {//j >= k+1
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    j--;
                }
                k++;
            }
        }
    }
    public static void main(String[] args) {
        int [] array = {1,2,4,5,8,3,7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
