package sword_point_offer;
//求和不适用+ - * /
public class GetSum {
    public static void main(String[] args) {
        System.out.println(Add(5, 7));

    }
    public static int Add(int num1,int num2) {
        while (num2 != 0) {
            //求无进位和 异或
            int sum = num1 ^ num2;
            //System.out.println(sum);
            //求进位 按位与 左移
            int carray = (num1 & num2) << 1;
            //System.out.println(carray);
            num1 = sum;
            num2 = carray;
        }
        return  num1;
    }
}
