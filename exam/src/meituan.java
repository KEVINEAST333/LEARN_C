import java.util.ArrayList;
import java.util.Scanner;

public class meituan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();
        int[][] arrays = new int[n][m];
        for(int i = 0; i < n;i++) {
            for (int j = 0;j < m;j++) {
                arrays[i][j] = scanner.nextInt();
            }
        }
        for(int i = 0; i < n;i++) {
            Boolean flag = false;
            String str = "";
            for (int j = 0;j < m;j++) {
               str += arrays[i][j] + " ";
            }
            for (int k = 0; k < arrayList.size();k++) {
                if(str.equals(arrayList.get(k))) {
                    flag = true;
                }
            }
            if(flag == false) {
                arrayList.add(str);
            }
        }
        for (int i = 0;i <arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
