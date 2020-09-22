public class WUBA {
    public static int calculate (String input) {
        int result = 0;
        // write code here
        if (input.contains(" * ")) {
            String[] strs = input.split(" \\* ");
            int a  = Integer.parseInt(strs[0]);
            int b  = Integer.parseInt(strs[1]);
            result = a*b;
            return result;
        } else if (input.contains(" / ")) {
            String[] strs = input.split(" / ");
            int a  = Integer.parseInt(strs[0]);
            int b  = Integer.parseInt(strs[1]);
           result = a/b;
            return result;
        }else if (input.contains(" + ")) {
            String[] strs = input.split(" \\+ ");
            int a  = Integer.parseInt(strs[0]);
            int b  = Integer.parseInt(strs[1]);
            result = a+b;
            return result;
        }else if (input.contains(" - ")) {
            String[] strs = input.split(" - ");
            int a  = Integer.parseInt(strs[0]);
            int b  = Integer.parseInt(strs[1]);
            result = a-b;
            return result;
        } else if (input.contains(" "))  {
            String[] strs = input.split(" ");
            result = Integer.parseInt(strs[0] + strs[1]);
            return result;
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(calculate("1 - 2"));
       System.out.println(calculate("1 * 2"));
        System.out.println(calculate("1 2"));
    }
}
