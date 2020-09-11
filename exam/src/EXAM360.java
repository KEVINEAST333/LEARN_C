import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EXAM360 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.next();
            Boolean flag = false;
            Boolean flag2 = false;
            Boolean flag3 = false;
            Boolean flag4 = false;
            Boolean flag5 = false;
            for (int i = 0; i < 9; i++) {
                String s = "";
                s = "" + i;
                if (str.contains(s)) {
                    flag = true;
                }
            }
            if (str.length() > 8) {
                flag2 = true;
            }
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLowerCase(str.charAt(i))) {
                    flag3 = true;
                }
                if (Character.isUpperCase(str.charAt(i))) {
                    flag4 = true;
                }
            }
            flag5 = sp(str);
            //System.out.println(flag5);
            if ((flag == true) && (flag2 == true) && (flag3 == true)
                    && (flag4 == true) && (flag5 == true)) {
                System.out.println("Ok");
            } else {
                System.out.println("Irregular password");
            }
        }
    }
    private static Boolean sp (String str){
        String regEx = "[ _`~!@#$%^&*()+=|{}':;',\\[\\]. <>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.find();
    }

}
