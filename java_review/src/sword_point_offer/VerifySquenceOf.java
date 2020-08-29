package sword_point_offer;
//输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
// 如果是则返回true,否则返回false。
// 假设输入的数组的任意两个数字都互不相同。
public class VerifySquenceOf {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length == 0) {
            return false;
        }
        if(sequence.length == 1) {
            return true;
        }
        boolean  result = judge(sequence,0,sequence.length -1);
        return result;
    }
    public boolean judge(int [] array,int left, int right) {
        if(left >= right) {
            return true;
        }
        int i = right - 1;
        while(i > left && array[i] > array[right]) {
            i--;
        }
        //i 为 小于 root 的 值第一个坐标
        for(int j = left;j < i;j++ ) {
            //从前向后遍历有一个不符合就不行
            if(array[j] > array[right]) {
                return false;
            }
        }
        //递归求解
        return  judge(array,left,i) && judge(array,i+1,right -1);
    }
}
