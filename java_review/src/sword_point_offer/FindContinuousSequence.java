package sword_point_offer;

import java.util.ArrayList;

public class FindContinuousSequence {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence2(int sum) {
        ArrayList<ArrayList<Integer> > result = new ArrayList<>();
        for(int i = 1; i < sum;i++) {
            ArrayList<Integer> array = new ArrayList<>();
            int sum2 = 0;
            for(int j = i;j < sum;j++) {
                sum2 += j;
                array.add(j);
                if(sum2 == sum) {
                    System.out.println(array.toString());
                    result.add(array);
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindContinuousSequence2(9);

    }
}
