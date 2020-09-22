package exam;

public class banyu {
    public static int lengthOfLongestSubstring (String s) {
        // write code here
        char[] chars = s.toCharArray();
        String str = "";
        int result = 0;
        int max = 0;
        for(int i = 0;i < s.length();i++) {
            if(!str.contains("" + chars[i])) {
                str += "" + chars[i];
                result++;
            }
            else {
                if(result > max) {
                    max = result;
                }
                str = "" + chars[i];
                result = 1;
            }
            if(result > max) {
                max = result;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("ipalfish"));
    }
}
