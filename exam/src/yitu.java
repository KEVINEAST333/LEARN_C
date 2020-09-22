import java.util.ArrayList;
import java.util.Scanner;

public class yitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int[][] array = new int[n][4];
        for (int i = 0;i < n;i++) {
            for (int j = 0; j < 4;j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int x0 = array[0][1];
        int y0 = array[0][2];
        int z0 = array[0][3];
        int time = array[0][0];
        for (int i = 1;i < n;i++) {
            int time2 = array[i][0];
            int x1 = array[i][1];
            int y1 = array[i][2];
            int z1 = array[i][3];
            int x = x1 - x0;
            int y = y1 - y0;
            int z = z1 - z0;
            int ti = time2 - time;
            int s = x*x + y*y +z*z;
            arrayList.add(s/ti);
            time = time2;
            x0 = x1;
            y0 = y1;
            z0 = z1;
        }
        int max = 0;
        System.out.println(arrayList.toString());
        int res = 0;
        for (int i = 0;i < arrayList.size();i++) {
            if(max < arrayList.get(i)) {
                max = arrayList.get(i);
                res = i;
            }
        }
        System.out.println(res + 1);
    }
}
