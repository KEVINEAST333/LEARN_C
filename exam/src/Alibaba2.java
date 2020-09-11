import java.util.ArrayList;
import java.util.Scanner;

public class Alibaba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ArrayList<String> arrayList = new ArrayList<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //ArrayList<ArrayList<Integer>> arraylist = new ArrayList<>();
        int [] [] array = new int[n][m];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                //arraylist.get(i).add(scanner.nextInt());
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (array[i][j] == -1) {

                }
            }
        }
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
