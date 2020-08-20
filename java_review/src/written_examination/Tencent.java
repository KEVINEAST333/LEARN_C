package written_examination;

import java.util.Scanner;

/*输出描述:
        输出一个字符串，代表解压后的字符串。

        输入例子1:
        HG[3|B[2|CA]]F

        输出例子1:
        HGBCACABCACABCACAF

        例子说明1:
        HG[3|B[2|CA]]F−>HG[3|BCACA]F−>HGBCACABCACABCACAF*/
public class Tencent {
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();
        scanner.close();
        System.out.println(decode(next));
    }

    public static String decode(String words){
        while (words.contains("]")){
            int right = words.indexOf("]");
            int left = words.lastIndexOf("[", right);
            String repeatStr = words.substring(left+1, right);
            String[] split = repeatStr.split("\\|");
           /* words = words.replace("["+repeatStr+"]",
                    String.join("", Collections.nCopies(Integer.parseInt(split[0]), split[1])));*/
           int n = Integer.parseInt(split[0]);
           String str = "";
           for (int i = 0;i < n;i++) {
               str += split[1];
           }
           words = words.replace("["+repeatStr+"]",str);
        }
        return words;
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();


            while(str.contains("]")) {
                int right = str.indexOf("]");
                int left = str.lastIndexOf("[",right);
                String tmp = str.substring(left+1,right);
                String[] splits = tmp.split("\\|");
                int n = Integer.parseInt(splits[0]);
                String str2 = "";
                for(int i = 0; i < n;i++) {
                    str2 += splits[1];
                }
                str  = str.replace("[" + tmp + "]", str2);
            }
            System.out.println(str);
    }
}
