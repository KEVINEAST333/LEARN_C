package sword_point_offer;

//应该包含某个负数,并期望旁边的正数会弥补它呢？例如:{6,-3,-2,7,-15,1,2,2},
// 连续子向量的最大和为8(从第0个开始,到第3个为止)。给一个数组，
// 返回它的最大连续子序列的和
public class FindGreatestSumOfSub {
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum = array[0];
        int max = array[0];
        for(int i = 1; i < array.length;i++) {
            if(sum > 0) {
                sum += array[i];
            } else {
                sum = array[i];
            }
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
    //动态规划
    public int FindGreatestSumOfSubArrayII(int[] array) {
        int max = array[0];
        int sum = array[0];
        for(int i = 1;i < array.length;i++) {
            sum = Math.max(sum + array[i],array[i]);
            if(sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
