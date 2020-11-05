package written_examination;

import java.util.Scanner;

public class yuewen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = "";
        //String s = scanner.next();
        int [][] arrays = new int[n][n];
        for (int i = 0;i < n;i++) {
            String s = scanner.next();
            String[] arr = s.split(",");
            for (int j = 0;j < n;j++) {
                arrays[i][j] = Integer.parseInt(arr[j]);
            }
        }
        int [] res = new int[n*n];
        int k = 0;
        for(int i = 0;i < n;i++) {
            for (int j = n-1;j >= 0;j--) {
                res[k] = arrays[j][i];
                k++;
            }
        }
        for(int i = 0;i <res.length;i++) {
            if( i != res.length -1) {
                str += res[i] + ",";
            } else {
                str += res[i];
            }
        }
        System.out.println(str);

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
   /* public int palindromeCount (String str) {
        // write code here
        StringBuilder stringBuilder = new StringBuilder(str);
        String s = "" + stringBuilder.reverse();
        if(s.equals(str)) {

        }
    }*/
   public String removeDuplicatedChars (String str) {
       // write code here
      char[] chars =  str.toCharArray();
      String s = "";
      for (int i = 0;i < str.length();i++) {
          String a = "" + chars[i];
          if(!s.contains(a)) {
              s += a;
          }
      }
      return s;
   }
}
