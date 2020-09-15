import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class tuya {
    public static void main(String[] args) {
        int [] array = new int[] {-2,-5,0,4,-7};
        int [] array2 = new int[] {-1,-2,-3};
        int sum = getSum(array2);
        System.out.println(sum);
    }
    private static int getSum(int[] array) {
        Arrays.sort(array);
        int sum = 0;
        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = array.length -1;i >=0;i--) {
            sum += array[i];
            if(sum > 0) {
                arrayList.add(array[i]);
            } else {
                break;
            }
        }
        Collections.reverse(arrayList);
        for (int i = 0;i < arrayList.size() ;i++) {
            result += ((i+1)*arrayList.get(i));
        }
        return result;
    }
}
