package class_review.class_review;
//跳台阶
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
public class JumpFloor {
    public int JumpFloorII(int target) {
        //F(n) = F(n - 1) + F(n - 2) +.......
        //f(n) = 2*f(n - 1)
        //f(1) == 1 f(2) == 2 f(3) == 4
        //f(n) == 2^n-1
        int k = 1;
        if(target == 0) {
            return 0;
        }
        for(int i = 1; i < target;i++) {
            k *= 2;
        }
        return k;
    }//青蛙只能跳 1 或 两步
    /*这是一道经典的递推题目，你可以想如果青蛙当前在第n级台阶上，那它上一步是在哪里呢？

    显然，由于它可以跳1级台阶或者2级台阶，所以它上一步必定在第n-1,或者第n-2级台阶，也就是说它跳上n级台阶的跳法数是跳上n-1和跳上n-2级台阶的跳法数之和。

    设跳上  级台阶有  种跳法，则它跳上n级的台阶有  种跳法。

    然后，我们又思考初始（）的情况，跳上1级台阶只有1种跳法，跳上2级台阶有2种跳法，最终我们得到如下的递推式：


    这个递推式和 比较相似，这里就简单写常用的两种实现方式，详情可以参考上篇博客解法：斐波那契数列（四种解法）。

    方法一：*/
    public static int JumpFloorI(int target) {
        if (target == 1) return 1;
        if (target == 2) return 2;
        return JumpFloorI(target - 1) + JumpFloorI(target - 2);
    }

    public static void main(String[] args) {
        System.out.println(JumpFloorI(6));
    }
}
