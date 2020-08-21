package written_examination;

import java.util.Scanner;

public class XiaoHongShu {
  /*  输入例子1:
    Corona(Trump)USA<<<Virus

    输出例子1:
    CoronaVirus    */
  public static void main(String[] args) {
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
}
