public class shenxinfu {
    public static void main(String[] args) {
        System.out.println(getSqrt(8));
    }
    public static int getSqrt (int num) {
        // write code here
        int a = (int)Math.sqrt((double) num);
        return a;

    }
    public int minDistance (String a, String b) {
      if(a.equals(b)) {
          return 0;
      }
      if(a.contains(b)) {
          return  a.length() - b.length();
      }
      //动态规划
      int[][]dp = new int[a.length() + 1][b.length() + 1];
      dp[0][0] = 0;
      for(int i = 1;i <= a.length();i++) {
          dp[i][0] = i;
      }
      for(int j = 0;j <= b.length();j++) {
          dp[0][j] = j;
      }
      for(int i = 1;i <= a.length();i++) {
          for(int j = 1;j <= b.length();j++) {
              if(a.charAt(i-1) == b.charAt(j-1)) {
                  dp[i][j] = dp[i-1][j-1];
              } else {
                  dp[i][j] = Math.min(Math.min(dp[i][j-1]+1,dp[i-1][j] +1),dp[i-1][j-1] + 1);
              }
          }

      }
        return dp[a.length()][b.length()];
    }
}
