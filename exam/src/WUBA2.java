import java.util.ArrayList;
import java.util.Collections;

public class WUBA2 {
    public ArrayList<Integer> mergerArrays (ArrayList<Integer> arrayA, ArrayList<Integer> arrayB) {
        // write code here
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0;i < arrayA.size();i++) {
            for (int j = 0;j < arrayB.size();j++) {
                if(arrayA.get(i).equals(arrayB.get(j))) {
                    result.add(arrayA.get(i));
                }
            }
        }
        Collections.sort(result);
        return result;
    }
}
