package written_examination;

import java.util.Arrays;
import java.util.Scanner;

public class XiaoHongShu {
  /*  输入例子1:
    Corona(Trump)USA<<<Virus

    输出例子1:
    CoronaVirus    */
  public static void main1(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String str = scanner.next();
      while(str.contains(")") ) {
          int right = str.indexOf(")");
          int left = str.lastIndexOf("(",right);
          String n = "";
          String rep = str.substring(left+1,right);
          str = str.replace("(" +rep+")",n );
      }
      while(str.contains("<")&& str != null) {
          int index = str.indexOf("<");
          String m = "";
          String rep2 = str.substring(index -1,index);
          str = str.replace(rep2 + "<",m );
      }
      System.out.println(str);
  }
  /*static class Treasure implements Comparator<Treasure> {
      @Override
      public String toString() {
          return "Treasure{" +
                  "a=" + a +
                  ", b=" + b +
                  '}';
      }

      int a;
      int b;

      @Override
      public int compare(Treasure o1, Treasure o2) {
          return o1.a - o2.b ;
      }

      public Treasure(int a, int b) {
          this.a = a;
          this.b = b;
      }
  }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Treasure> arrayList = new ArrayList<>();
        int result = 0;
        int n = scanner.nextInt();
        for (int i = 0; i < n;i++) {
           int a = scanner.nextInt();
           int b = scanner.nextInt();
           Treasure treasure = new Treasure(a,b);
           arrayList.add(treasure);
        }
        Collections.sort(arrayList, new Comparator<Treasure>() {
            @Override
            public int compare(Treasure o1, Treasure o2) {
                return o1.a - o2.b;
            }
        });
        for (int i = 0;i < n -1;i++) {
            if((arrayList.get(i + 1).a >= arrayList.get(i + 1).a)
                    &&(arrayList.get(i + 1).b >= arrayList.get(i + 1).b)) {
                result++;
            }
        }
        System.out.println(result);
        System.out.println(arrayList);
    }*/


   // 来源：牛客网
    //按照一个维度排序后按照另一个维度寻找最长增加子序列即可，这个是>=的比较简单一点，注意不能用O(n2)，要二分查找优化

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[][] ans = new int[n][2];
            for(int i=0;i<n;i++){
                ans[i][0] = scanner.nextInt();
                ans[i][1] = scanner.nextInt();
            }
            Arrays.sort(ans,(a, b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
            int[] arr = new int[n];
            for(int i=0;i<n;i++)arr[i] = ans[i][1];
            System.out.println(LIS(arr));
        }
        public static int LIS(int[] arr){
            int[] dp = new int[arr.length];
            int res = 0;
            for(int num:arr){
                int l = 0,r = res;
                while (l<r){
                    int m = (l+r)/2;
                    if(dp[m]<num)l = m+1;
                    else r = m;
                }
                dp[l] = num;
                if(l==res)res++;
            }
            return res;
        }
    }
