import java.time.temporal.ValueRange;
import java.util.*;

public class iqiy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split(" ");
   //    System.out.println(strs[1]);
        int [] array = new int[strs.length] ;
       for (int i = 0 ;i <array.length;i++) {
           array[i] = Integer.parseInt(strs[i]);
       }
     findk(array);
}
    private static void findk(int[] array) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int le = array.length;
        for (int i = 0; i < le - 1;i++) {
            int val = array[i];
            if(hashMap.containsKey(val)) {
                int count = hashMap.get(val) ;
                hashMap.put(val,count +1);
            } else {
                hashMap.put(val,1);
            }
        }
        Collection<Integer> collection = hashMap.values();
        int max = 0;
        int maxcount = Collections.max(collection);
        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() == maxcount) {
                max = entry.getKey();
            }
        }
        System.out.println(max);
    }
    }
