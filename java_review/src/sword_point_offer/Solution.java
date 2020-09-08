package sword_point_offer;

import java.util.ArrayList;
/*
题目描述：
给定一个三角矩阵，找出自顶向下的最短路径和，每一步可以移动到下一行的相邻数字。
比如给定下面一个三角矩阵，自顶向下的最短路径和为11。
方法：动态规划
状态：
子状态：从(0,0)到(1,0),(1,1),(2,0),...(n,n)的最短路径和
F(i,j): 从(0,0)到(i,j)的最短路径和
状态递推：
F(i,j) = min( F(i-1, j-1), F(i-1, j)) + triangle[i][j]
比特科技初始值：
F(0,0) = triangle[0][0]
返回结果：
min(F(n-1, i))
*/
public class Solution {
    public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
        if(triangle.isEmpty()) {
            return 0;
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < triangle.size(); ++i) {
            result.add(new ArrayList<>());
        }
        result.get(0).add(triangle.get(0).get(0));
        int sum = triangle.get(0).get(0);
        for(int i = 1;i < triangle.size();i++) {
            int tmp = 0;
            for(int j = 0;j <= i;j++) {
                //最左边一行
                if(j == 0) {
                    tmp = result.get(i-1).get(0);
                }
                //最右边一行
                else if(j == i){
                    tmp = result.get(i-1).get(j-1);
                }
                //中间行
                else {
                    tmp = Math.min(result.get(i-1).get(j),result.get(i-1).get(j -1));
                }
                sum = tmp + triangle.get(i).get(j);
                result.get(i).add(sum);
            }
        }
        int a = result.get(result.size() -1).get(0);
        for(int i = 1;i < triangle.size();i++) {
            a = Math.min(a,result.get(result.size() -1).get(i));
        }
        return a;
    }
}
