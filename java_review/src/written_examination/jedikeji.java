package written_examination;

import java.util.Arrays;
import java.util.Random;

public class jedikeji {
    public static void main(String[] args) {
        boolean flag = true;
        int [] arr = new int[10];

            for (int i = 0;i < 10;i++) {
                Random random = new Random();
                double d2 = random.nextDouble();
                System.out.println(d2);
                if(d2 <= 0.005) {
                    arr[i] = 4;
                } else if (d2 <= 0.1005 ) {
                    arr[i] = 3;
                } else if(d2 <= 0.5005) {
                    arr[i] = 2;
                } else if(d2 <= 1.000) {
                    arr[i] = 1;
                }
            }
            //判断是否有精英或史诗
          /*  for (int i = 0;i < 10;i++) {
                if(arr[i] >= 3) {
                    flag = false;
                }
            }*/

        System.out.println(Arrays.toString(arr));
    }
    public static int[] RotatePic90(int width, int height, int[] input){
        // 一维数组转二维
        int[][] arrays = new int[width][height];
        int k = 0;
        for(int i = 0;i < width;i++) {
            for (int j = 0;j < height;j++) {
                arrays[i][j] = input[k];
                k++;
            }
        }
        k = 0;
        //翻转二维数组转一维
        int [] res = new int[input.length];
        for(int i = 0;i < height;i++) {
            for (int j = width-1;j >= 0;j--) {
                res[k] = arrays[j][i];
                k++;
            }
        }
        return res;
    }
    int getValue(int[] nums, int n) {
        //排序
        Arrays.sort(nums);
        //如果有超过肯定在已排序的nums[n/2]出现
        int val =  nums[n/2];
        int k = 0;
        for (int i = 0;i < nums.length;i++) {
            if(nums[i] == val) {
                k++;
            }
        }
        if(k > (n/2)) {
            return val;
        } else {
            return 0;
        }
    }
    int[] getTenGeneral() {
        boolean flag = true;
        int[] arr = new int[10];
        while (flag) {
            for (int i = 0; i < 10; i++) {
                Random random = new Random();
                double d2 = random.nextDouble();
                System.out.println(d2);
                if (d2 <= 0.005) {
                    arr[i] = 4;
                } else if (d2 <= 0.1005) {
                    arr[i] = 3;
                } else if (d2 <= 0.5005) {
                    arr[i] = 2;
                } else if (d2 <= 1.000) {
                    arr[i] = 1;
                }
            }
            //判断是否有精英或史诗
            for (int i = 0; i < 10; i++) {
                if (arr[i] >= 3) {
                    flag = false;
                }
            }
        }return arr;
    }
}
