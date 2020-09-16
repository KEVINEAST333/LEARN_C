package written_examination;

import java.util.Scanner;

public class GrowingIo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int target = scanner.nextInt();
        String[] strs = str.split(" ");
        int[] nums = new int[strs.length];
        for (int i = 0;i < strs.length;i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        int result = serach(nums, target);
        System.out.println(result);
    }

    private static int  serach(int[] nums, int target) {
        int  left = 0;
        int  right = nums.length -1;
        while(left < right) {
            int mid = (right + left)/2;
            if(nums[mid] > target) {
               right = mid - 1;
            }else if(nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return - 1;
    }
}
