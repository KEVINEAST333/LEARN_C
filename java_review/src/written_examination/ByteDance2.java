package written_examination;

import java.util.Scanner;
//Z国的货币系统包含面值1元、4元、16元、64元共计4种硬币，
// 以及面值1024元的纸币。现在小Y使用1024元的纸币购买了一件价值为的商品，
// 请问最少他会收到多少硬币？
public class ByteDance2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n == 1024) {
            System.out.println(0);
        } else {
            int m = 1024 - n;
            int p_64 = m /64;
            m = m % 64;
            int p_16 = m / 16;
            m = m % 16;
            int p_4 = m / 4;
            m = m % 4;
            System.out.println(p_4 + p_16 +p_64 + m);
        }

    }
}
