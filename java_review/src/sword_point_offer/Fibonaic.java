package sword_point_offer;

public class Fibonaic {
    //求斐波那契
    public int Fibonacci(int n) {
        //递归
      /*if(n == 0) {
          return 0;
    }
        if(n == 1 || n == 2) {
            return 1;
  }
         return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    */
        //动态规划
       /* if(n == 0) {
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int[] array = new int[n + 1];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i < n + 1 ;i++) {
            array[i] = array[i -1] + array[i -2];
        }

        return array[n];
        */
        // 加和
        int f0 = 0;
        int f1 = 1;
        int fn = 0;
        if(n == 0) {
            return f0;
        }

        if(n == 1) {
            return f1;
        }
        for(int i = 1; i < n;i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;


    }
}
