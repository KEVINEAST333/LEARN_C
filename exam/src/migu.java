import java.util.ArrayList;
import java.util.Scanner;
public class migu {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
            int result = 0;
            String str = scan.nextLine();
            String [] strs = str.split(" ");
            ArrayList<Integer> arrayList = new ArrayList<>();
            for(int i = 0;i < strs.length;i++) {
                arrayList.add(Integer.parseInt(strs[i]));
            }
            for(int i = 0;i < arrayList.size();i++) {
                result ^= arrayList.get(i);
            }
            System.out.println(result);
        }
        }


