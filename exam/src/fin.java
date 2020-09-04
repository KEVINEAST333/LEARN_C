import java.sql.Connection;
import java.util.*;

public class fin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        String str = "";
        int n = scanner.nextInt();
        Integer [] result = new Integer[n];
        for(int i = 0;i < n;i++) {
            //arrayList.add(scanner.nextInt());
            result[i] = scanner.nextInt();
        }
        Arrays.sort(result,Collections.reverseOrder());
        System.out.println(result.toString());
        int j = 0 ;
        int end = result.length -1;
                while(result[j] != 0) {
                    for(int i = 0; i < n;i++) {
                        str += result[i];
                    }
                    int k = str.indexOf("0");
                    if(k != 0) {
                        k--;
                    }
                    Integer res = new Integer(str);
                    if(res % 90 == 0) {
                        System.out.println(res);
                        break;
                    }
                    int tmp = result[end];
                    result[end] = result[k];
                    result[k] = tmp;
                    end--;

                }
    }
}
